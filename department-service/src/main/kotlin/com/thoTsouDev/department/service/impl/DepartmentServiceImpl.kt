package com.thoTsouDev.department.service.impl

import com.thoTsouDev.department.model.Department
import com.thoTsouDev.department.repository.DepartmentRepository
import com.thoTsouDev.department.service.DepartmentService
import org.springframework.stereotype.Service
import java.util.*

@Service
class DepartmentServiceImpl(private val departmentRepository: DepartmentRepository): DepartmentService {

    override fun saveDepartment(department: Department): Department =
        departmentRepository.save(department)

    override fun findDepartmentById(id: String): Optional<Department> =
        departmentRepository.findById(id)
}