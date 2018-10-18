package com.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.entity.Employee;

public class UpdateEmployee {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
	
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	Employee employee = em.find(Employee.class, 123);
	
	//before update
	System.out.println(employee);
	employee.setSalary(5000);
	em.getTransaction().commit();
	
	//after update
	System.out.println(employee);
	em.close();
	emf.close();
}
}
