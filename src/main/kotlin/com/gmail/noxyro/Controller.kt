package com.gmail.noxyro

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller {

    @RequestMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }

}