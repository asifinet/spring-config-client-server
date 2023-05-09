package com.app.client.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.client.model.Employee;
import com.app.client.repository.EmployeeRepository;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class EmployeeControllers {
	
	@Autowired
	EmployeeRepository emprepo;
	
	@GetMapping(value = "/api/v1/employee/{empno}")
	@ResponseBody
	public ResponseEntity<?> GetEmployee(@PathVariable("empno") Integer empno) {
		 final Optional<Employee> response = emprepo.findByempno(empno);
		 return new ResponseEntity<>(response, HttpStatus.FOUND);
	}
	
	@GetMapping(value = "/api/v1/employee/")
	@ResponseBody
	public ResponseEntity<?> GetAllEmployees() {
		 final List<Employee> response = emprepo.findAll();
		 return new ResponseEntity<>(response, HttpStatus.FOUND);
	}
	
	
	@PostMapping(value = "/api/v1/employee/")
	@ResponseBody
	public ResponseEntity<?> saveEmployee(@RequestBody final Employee emp) {
		 Employee response =  emprepo.save(emp);		 
		 return new ResponseEntity<>(response, HttpStatus.CREATED);
	}	
}