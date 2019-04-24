package com.gmail.noxyro.dhtmlgb

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class ApplicationController {

	@RequestMapping("/")
	fun index(): String {
		return "index"
	}

}
