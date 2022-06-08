package com.example.employeeportal.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.employeeportal.entity.Employee;
import com.example.employeeportal.model.EmployeeModel;

@Mapper
public interface EmployeeMapper {
	
	List<EmployeeModel> employeeListToEmployeeModelList(List<Employee> employeeList);
	

}
