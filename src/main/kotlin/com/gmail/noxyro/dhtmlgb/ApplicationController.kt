package com.gmail.noxyro.dhtmlgb

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*

@Controller
class ApplicationController {

	lateinit var commentMap: LinkedHashMap<UUID, String>

	@GetMapping("/")
	fun index(): String {
		return "index"
	}

	@GetMapping("/entry")
	fun entry(): String {

		return "entry"
	}

	@GetMapping("/comment/")
	@ResponseBody
	fun allComments(): List<String> {
		return commentMap.values.toList()
	}

	@PostMapping("/post")
	@ResponseBody
	fun postContent(@RequestBody form: String): String {
		return form
		/*val uid = UUID.randomUUID()
		commentMap[uid] = form
		return ResponseEntity.ok(uid)*/
	}

	@GetMapping("/comment/{uid}")
	@ResponseBody
	fun getComment(@PathVariable uid: UUID): String {
		return "comment"
	}

	@PutMapping("/comment/{uid}")
	@ResponseBody
	fun putComment(@PathVariable uid: UUID): String {
		return "comment"
	}

	@DeleteMapping("/comment/{uid}")
	@ResponseBody
	fun deleteComment(@PathVariable uid: UUID): String {
		return "comment"
	}


}


