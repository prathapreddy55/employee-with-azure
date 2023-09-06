package com.pt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pt.demo.beans.Employee;



@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
