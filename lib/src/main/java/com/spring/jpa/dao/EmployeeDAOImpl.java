package com.spring.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
import com.spring.jpa.entity.Employee;

	@Component
	public class EmployeeDAOImpl implements EmployeeDAO {
		
		@PersistenceContext
		private EntityManager entityManager;
		
		@Transactional
		@Override
		public void insertEmployeeDatail(Employee emp) {
			try {
				entityManager.persist(emp);
				System.out.println("Insertion Successful");
				
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("Insertion Failed");
			}
		}

	@Transactional
	@Override
	public void updateEmployeeDatail(int id) {
		try {
			Employee emp = entityManager.find(Employee.class, id);
			emp.setName("Yogesh");
			emp.setProject("Ocean");
			System.out.println("Updation Successful");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Updation Failed");
		}
	}

	@Transactional
	@Override
	public void deleteEmployeeDatail(int id) {
		try {
			Employee employee = entityManager.find(Employee.class, id);
			entityManager.remove(employee);
			System.out.println("Deletion Successful");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Deletion Failed");
		}
	}

}
