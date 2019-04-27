package com.gmail.noxyro.dhtmlgb

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Entry(
	val name: String,
	val mail: String,
	val content: String,
	val timestamp: String
)

data class NewEntry @JsonCreator constructor(
	@JsonProperty("name") val name: String,
	@JsonProperty("mail") val mail: String,
	@JsonProperty("content") val content: String
)
