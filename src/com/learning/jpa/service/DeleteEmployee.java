package com.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.entity.Employee;

public class DeleteEmployee {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, 123);
		em.remove(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
