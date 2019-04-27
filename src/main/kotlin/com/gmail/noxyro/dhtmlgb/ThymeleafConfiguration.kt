package com.gmail.noxyro.dhtmlgb

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.thymeleaf.spring5.SpringTemplateEngine
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.spring5.view.ThymeleafViewResolver
import org.thymeleaf.templatemode.TemplateMode


@Configuration
open class ThymeleafConfiguration {

	@Bean
	open fun templateEngine(): SpringTemplateEngine {
		val templateEngine = SpringTemplateEngine()
		templateEngine.setTemplateResolver(templateResolver())
		return templateEngine
	}

	@Bean
	open fun templateResolver(): SpringResourceTemplateResolver {
		val templateResolver = SpringResourceTemplateResolver()
		templateResolver.prefix = "classpath:/templates/"
		templateResolver.suffix = ".html"
		templateResolver.templateMode = TemplateMode.HTML
		return templateResolver
	}

	@Bean
	open fun viewResolver(): ThymeleafViewResolver {
		val viewResolver = ThymeleafViewResolver()
		viewResolver.templateEngine = templateEngine()
		return viewResolver
	}
}
