package com.spring.jpa.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jpa.dao.EmployeeDAO;
import com.spring.jpa.entity.Employee;
import com.spring.jpa.resources.SpringConfigFile;

public class TestingApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
//		emp.setId(5);
		emp.setName("Aarti");
		emp.setCity("Noida");
		emp.setProject("Java");
		emp.setSalary(500000.0f);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class); 
		EmployeeDAO dao = context.getBean("employeeDAOImpl", EmployeeDAO.class);
		dao.insertEmployeeDatail(emp);
	}
}
