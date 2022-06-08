package com.example.employeeportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeportal.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
