package com.learning.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.learning.jpa.entity.Employee;

public class BetweenAndLikeFunctions {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
	EntityManager em = emf.createEntityManager();
	
	// Between
	Query query = em.createQuery("select e "+ "from Employee e "+"where e.salary "+"Between 30000 and 40000");
	
	List<Employee> list = (List<Employee>)query.getResultList();
	
	for( Employee e:list) {
		System.out.print("Employee ID :"+e.getEid());
		System.out.println("\t Employee salary :"+e.getSalary());
	}
	
	// Like
	Query query1 = em.createQuery("select e "+"from Employee e "+"where e.ename LIKE 'M%'");
	
	List<Employee> list1 = (List<Employee>)query1.getResultList();
	
	for(Employee e:list1) {
		System.out.println("Employee ID :"+e.getEname());
		System.out.println("\t Employee name :"+e.getEname());
	}
	
	
}
}
