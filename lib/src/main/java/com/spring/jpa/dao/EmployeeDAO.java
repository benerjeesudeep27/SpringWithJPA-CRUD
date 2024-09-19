package com.spring.jpa.dao;

import org.springframework.stereotype.Component;

import com.spring.jpa.entity.Employee;
@Component
public interface EmployeeDAO {
	public void insertEmployeeDatail(Employee emp);

	public void updateEmployeeDatail(int id);

	public void deleteEmployeeDatail(int id);

}
