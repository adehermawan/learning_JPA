package com.learning.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFunctions {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
	EntityManager em = emf.createEntityManager();
	
	// Scalar function
	Query query = em.createQuery("select UPPER(e.ename) from Employee e");
	List<String> list = query.getResultList();
	
	for (String e:list) {
		System.out.println("Employee Name :"+e);
	}
	
	// Aggregate function
	Query query1 = em.createQuery("select MAX(e.salary) from Employee e");
	Double result = (Double) query1.getSingleResult();
	System.out.println("Max Employee Salary :"+result);
}
}
