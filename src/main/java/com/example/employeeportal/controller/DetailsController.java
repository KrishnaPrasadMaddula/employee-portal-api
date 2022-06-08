package com.example.employeeportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeportal.entity.Employee;
import com.example.employeeportal.model.EmployeeModel;
import com.example.employeeportal.service.EmployeeDetailsService;

@RestController
@RequestMapping("/details")
public class DetailsController {
	
	@Autowired
	private EmployeeDetailsService employeeDetailsServiceImpl;
	
	@GetMapping("/")
	public ResponseEntity findAllEmployees() {
		ResponseEntity response =null;
		List<Employee> listOfEmployee =  employeeDetailsServiceImpl.findAll();
		if(listOfEmployee != null && !listOfEmployee.isEmpty()) {
			return response.status(HttpStatus.OK).body(listOfEmployee);
		}else {
			return response.status(HttpStatus.NO_CONTENT).body("No employees found at this time");
		}
		
	}
	
	

}
