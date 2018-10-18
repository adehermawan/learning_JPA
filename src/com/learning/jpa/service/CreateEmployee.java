package com.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.entity.Employee;

public class CreateEmployee {
	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("learning_JPA");
		
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEid(1203);
		employee.setEname("Masthanvali");
		employee.setSalary(40000);
		employee.setDeg("Technical Writer");
		
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}

}
