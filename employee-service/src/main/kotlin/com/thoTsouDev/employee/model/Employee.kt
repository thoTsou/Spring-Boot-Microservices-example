package com.thoTsouDev.department.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("employees")
data class Employee(
    @Id
    val id: String = System.currentTimeMillis().toString(),
    val firstname: String,
    val lastname: String,
    val email: String,
    val department: String
)
