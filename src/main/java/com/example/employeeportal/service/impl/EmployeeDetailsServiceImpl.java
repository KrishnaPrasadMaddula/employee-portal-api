package com.example.employeeportal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeportal.entity.Employee;
import com.example.employeeportal.model.EmployeeModel;
import com.example.employeeportal.repository.EmployeeRepository;
import com.example.employeeportal.service.EmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService{

	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> findAll() {
	
//		List<EmployeeModel> employeeModelList = new ArrayList<>();;
//		BeanUtils.copyProperties(employeeRepo.findAll(), employeeModelList);
		
		List<Employee> employeeList = employeeRepo.findAll();
		
//		System.out.println(employeeModelList.get(0).toString());
		
		return employeeList!=null ? employeeList : new ArrayList<>();
	}

}
