package com.thoTsouDev.department.service.impl

import com.thoTsouDev.department.model.Employee
import com.thoTsouDev.department.repository.EmployeeRepository
import com.thoTsouDev.department.service.EmployeeService
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployoeeServiceImpl(private val employeeRepository: EmployeeRepository): EmployeeService {

    override fun saveEmployee(employee: Employee): Employee =
        employeeRepository.save(employee)

    override fun findEmployeeById(id: String): Optional<Employee> =
        employeeRepository.findById(id)
}