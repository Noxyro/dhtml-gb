package com.gmail.noxyro.dhtmlgb

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler
import java.util.*

@Configuration
open class ApplicationConfiguration {

	@Bean
	open fun faviconHandlerMapping(): SimpleUrlHandlerMapping {
		val mapping = SimpleUrlHandlerMapping()
		mapping.order = Integer.MIN_VALUE
		mapping.urlMap = Collections.singletonMap(
			"favicon.ico",
			faviconRequestHandler()
		)
		return mapping
	}

	@Bean
	open fun faviconRequestHandler(): ResourceHttpRequestHandler {
		val requestHandler = ResourceHttpRequestHandler()
		requestHandler.locations = Arrays.asList(ClassPathResource("/") as Resource)
		return requestHandler
	}
}
