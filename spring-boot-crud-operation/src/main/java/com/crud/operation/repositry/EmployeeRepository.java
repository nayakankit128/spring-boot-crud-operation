package com.crud.operation.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.operation.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
