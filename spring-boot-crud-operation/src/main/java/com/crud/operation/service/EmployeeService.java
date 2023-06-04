package com.crud.operation.service;

import java.util.List;

import com.crud.operation.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
