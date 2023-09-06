package com.pt.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.demo.beans.Employee;
import com.pt.demo.repository.EmployeeRepository;



@Service
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	public String savetheEmployee(Employee employee) {
		Employee emp=emprepo.save(employee);
		String result=null;
		if(emp!=null) {
			result="you employee id is generated is"+emp.getEmpid();
		}else {
			result="An error occured while inserting the data";
		}
		return result;
	}
	
}
