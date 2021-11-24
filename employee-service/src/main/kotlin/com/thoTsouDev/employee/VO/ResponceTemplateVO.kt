package com.thoTsouDev.employee.VO

import com.thoTsouDev.department.model.Employee
import java.util.*

data class ResponceTemplateVO(
    val employee: Optional<Employee>,
    val department: Department
)