package com.thoTsouDev.employee.VO

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

data class Department(
    val id: String = System.currentTimeMillis().toString(),
    val name: String,
    val address: String,
    val code: String
)
