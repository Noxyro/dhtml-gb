package com.gmail.noxyro.dhtmlgb

import com.fasterxml.jackson.databind.ObjectMapper

fun <T : Any> T.toJsonString(): String {
	return ObjectMapper().writerFor(this::class.java).writeValueAsString(this)
}

fun <T : Any> T.fromJsonString(json: String): T {
	return ObjectMapper().readerFor(this::class.java).readValue(json)
}
