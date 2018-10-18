package com.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.entity.Employee;

public class FindEmployee {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, 123);
		
		System.out.println("Employee ID = "+employee.getEid());
		System.out.println("Employee Name = "+employee.getEname());
		System.out.println("Employee Salary = "+employee.getSalary());
		System.out.println("Employee Designation = "+employee.getDeg());
		
	}

}
