package com.ust.employeeBackEndProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.employeeBackEndProject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
