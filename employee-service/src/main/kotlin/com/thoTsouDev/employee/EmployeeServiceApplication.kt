package com.thoTsouDev.employee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class EmployeeServiceApplication{

	@Bean
	fun restTemplate(): RestTemplate =
		RestTemplate()
}

fun main(args: Array<String>) {
	runApplication<EmployeeServiceApplication>(*args)
}
