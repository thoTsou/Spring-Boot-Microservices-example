package com.thoTsouDev.department.controller

import com.thoTsouDev.department.model.Department
import com.thoTsouDev.department.service.DepartmentService
import lombok.extern.slf4j.Slf4j
import org.bson.types.ObjectId
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/departments")
@Slf4j
class DepartmentController(private val departmentService: DepartmentService) {

    @PostMapping("/save")
    fun saveDepartment(@RequestBody department: Department): ResponseEntity<Department> =
        ResponseEntity.ok().body(departmentService.saveDepartment(department))

    @GetMapping("/{id}")
    fun findDepartmentById(@PathVariable("id") id:String): ResponseEntity<Optional<Department>> =
        ResponseEntity.ok().body(departmentService.findDepartmentById( id ))
}