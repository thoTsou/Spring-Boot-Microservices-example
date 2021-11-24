package com.thoTsouDev.department.repository

import com.thoTsouDev.department.model.Employee
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository: MongoRepository<Employee , String> {
}