package com.gmail.noxyro.dhtmlgb

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.thymeleaf.TemplateEngine
import org.thymeleaf.context.Context
import java.io.File
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*
import kotlin.collections.LinkedHashMap

@Controller
class DhtmlGuestbookApplicationController {

	@Autowired
	private lateinit var templateEngine: TemplateEngine

	private val entriesPath: String = "entries.json"
	private var entries: LinkedHashMap<String, Entry> = File(entriesPath).run {
		if (!exists()) {
			linkedMapOf()
		} else {
			val text = this.readText()
			linkedMapOf<String, Entry>().fromJsonString(text)
		}
	}

	@GetMapping("/")
	fun index(): String {
		return "index"
	}

	@GetMapping("/entries")
	@ResponseBody
	fun entries(): String {
		val ctx = Context()
		ctx.setVariable("entries", entries.values)
		return processTemplate("entries", ctx)
	}

	@GetMapping("/errors")
	@ResponseBody
	fun errors(errors: List<String>): String {
		val ctx = Context()
		ctx.setVariable("errors", errors)
		return processTemplate("errors", ctx)
	}

	private fun processTemplate(template: String, context: Context): String {
		return this.templateEngine.process(template, context)
	}

	@PostMapping("/post")
	@ResponseBody
	fun postContent(@RequestBody json: String): String {
		val newEntry: NewEntry = ObjectMapper().readerFor(NewEntry::class.java).readValue<NewEntry>(json)

		val errors = validateEntry(newEntry)

		if (errors.isNotEmpty()) { return errors(errors) }

		val formatter: DateTimeFormatter = DateTimeFormatter
			.ofLocalizedDateTime(FormatStyle.MEDIUM)
			.withLocale(Locale.GERMANY)
			.withZone(ZoneId.systemDefault())
		val id = UUID.randomUUID().toString()
		val time: String = formatter.format(Instant.now())
		val entry = Entry(id, newEntry.name, newEntry.mail, newEntry.content, time)

		val newEntries = linkedMapOf<String, Entry>(id to entry)
		newEntries.putAll(entries)
		entries = newEntries

		File(entriesPath).writeText(entries.toJsonString())
		return ""
	}

	@DeleteMapping("/remove")
	@ResponseBody
	fun removeContent(@RequestBody uuid: String): String {
		val id = uuid.substring(1, uuid.length - 1)
		if (!entries.containsKey(id)) return "Invalid ID!"

		entries.remove(id)
		return ""
	}

	private fun validateEntry(entry: NewEntry): List<String> {
		val errors: MutableList<String> = mutableListOf()

		if (entry.name == "" || entry.name.contains(Regex("[\\\\\"'<>]"))) errors.add("Invalid name! Name is empty or contains invalid characters.")
		if (entry.mail == "" || !entry.mail.contains(Regex("[A-Za-z].*[@].+\\..+"))) errors.add("Invalid email!")
		if (entry.content == "") errors.add("No content!")

		return errors
	}
}


