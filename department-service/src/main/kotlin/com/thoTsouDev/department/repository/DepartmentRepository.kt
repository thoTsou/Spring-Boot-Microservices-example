package com.thoTsouDev.department.repository

import com.thoTsouDev.department.model.Department
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DepartmentRepository: MongoRepository<Department , String> {
}