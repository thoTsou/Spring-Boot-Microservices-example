package com.thoTsouDev.department.service

import com.thoTsouDev.department.model.Department
import org.springframework.http.ResponseEntity
import java.util.*

interface DepartmentService {

    fun saveDepartment(department: Department): Department

    fun findDepartmentById(id: String): Optional<Department>

}