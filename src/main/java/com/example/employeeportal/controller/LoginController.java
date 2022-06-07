package com.example.employeeportal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class LoginController {
	
	@GetMapping("/login/{userName}/{password}")
	public ResponseEntity authenticateEmployee(@PathVariable(value="userName") String userName, @PathVariable(value="password") String password) {
		System.out.println("User name: "+userName);
		System.out.println("Password: "+password);
		
		return ResponseEntity.status(HttpStatus.OK).body("Getting the request for userName "+userName);
	}

}
