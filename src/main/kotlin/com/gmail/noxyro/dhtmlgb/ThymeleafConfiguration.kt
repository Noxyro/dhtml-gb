package com.gmail.noxyro.dhtmlgb

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.thymeleaf.spring5.SpringTemplateEngine
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.spring5.view.ThymeleafViewResolver


@Configuration
@EnableWebMvc
open class ThymeleafConfiguration {

	@Bean
	open fun templateEngine(): SpringTemplateEngine {
		val templateEngine = SpringTemplateEngine()
		templateEngine.setTemplateResolver(thymeleafTemplateResolver())
		return templateEngine
	}

	@Bean
	open fun thymeleafTemplateResolver(): SpringResourceTemplateResolver {
		val templateResolver = SpringResourceTemplateResolver()
		templateResolver.prefix = "classpath:/templates/"
		templateResolver.suffix = ".html"
		templateResolver.setTemplateMode("HTML")
		return templateResolver
	}

	@Bean
	open fun thymeleafViewResolver(): ThymeleafViewResolver {
		val viewResolver = ThymeleafViewResolver()
		viewResolver.templateEngine = templateEngine()
		return viewResolver
	}
}
