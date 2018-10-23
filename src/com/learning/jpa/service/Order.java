package com.learning.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.learning.jpa.entity.Employee;

public class Order {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
		EntityManager em = emf.createEntityManager();
		
		// between
		Query query = em.createQuery("select e "+"from Employee e "+"ORDER BY e.ename ASC");
		
		List<Employee> list = (List<Employee>)query.getResultList();
		for(Employee e:list) {
			System.out.print("Employee ID : "+ e.getEid());
			System.out.println("Employee Name : "+ e.getEname());
		}
	}
}
