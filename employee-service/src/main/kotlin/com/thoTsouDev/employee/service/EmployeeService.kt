package com.thoTsouDev.department.service

import com.thoTsouDev.department.model.Employee
import java.util.*

interface EmployeeService {

    fun saveEmployee(employee: Employee): Employee

    fun findEmployeeById(id: String): Optional<Employee>

}