package com.app.client.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.app.client.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
    Optional<Employee> findByempno(@Param("empno") Integer empno);
}