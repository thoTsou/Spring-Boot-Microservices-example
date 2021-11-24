package com.thoTsouDev.department.controller

import com.thoTsouDev.department.model.Employee
import com.thoTsouDev.department.service.EmployeeService
import com.thoTsouDev.employee.VO.Department
import com.thoTsouDev.employee.VO.ResponceTemplateVO
import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/employees")
@Slf4j
class EmployeeController(private val employeeService: EmployeeService,private val restTemplate: RestTemplate) {

    @PostMapping("/save")
    fun saveDepartment(@RequestBody employee: Employee): ResponseEntity<Employee> =
        ResponseEntity.ok().body(employeeService.saveEmployee(employee))

    @GetMapping("/{id}")
    fun getUser(@PathVariable("id") id: String): ResponseEntity<ResponceTemplateVO> {
        val employee = employeeService.findEmployeeById(id)

        val department: Department? = restTemplate.getForObject("http://localhost:9001/departments/"+employee.get().department ,Department::class.java)

        return ResponseEntity.ok().body(department?.let { ResponceTemplateVO(employee, it) })
    }
}