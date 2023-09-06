package com.pt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pt.demo.beans.Employee;
import com.pt.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl serviceImpl;
	
	@PostMapping("/saveEmp")
	public ResponseEntity<String> savetheEmployee(@RequestBody Employee emp){
		
		String serviceRestult=serviceImpl.savetheEmployee(emp);
		
		ResponseEntity<String> res=new ResponseEntity<String>(serviceRestult, HttpStatus.CREATED);
		return res ;
	}

}
