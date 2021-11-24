package com.thoTsouDev.department.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("departments")
data class Department(
    @Id
    val id: String = System.currentTimeMillis().toString(),
    val name: String,
    val address: String,
    val code: String
)
