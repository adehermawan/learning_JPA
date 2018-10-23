package com.learning.jpa.relations.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.relations.entity.Department;
import com.learning.jpa.relations.entity.Employe;

public class ManyToOne {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		// Create Department Entity
		Department dep = new Department();
		dep.setName("Development");
		
		// store department
		em.persist(dep);
		
		//Create Employee1 Entity
		   Employe employee1 = new Employe();
		   employee1.setEname("Satish");
		   employee1.setSalary(45000.0);
		   employee1.setDeg("Technical Writer");
		   employee1.setDepartment(dep);

		   //Create Employee2 Entity
		   Employe employee2 = new Employe();
		   employee2.setEname("Krishna");
		   employee2.setSalary(45000.0);
		   employee2.setDeg("Technical Writer");
		   employee2.setDepartment(dep);

		   //Create Employee3 Entity
		   Employe employee3 = new Employe();
		   employee3.setEname("Masthanvali");
		   employee3.setSalary(50000.0);
		   employee3.setDeg("Technical Writer");
		   employee3.setDepartment(dep);

		   //Store Employees
		   em.persist(employee1);
		   em.persist(employee2);
		   em.persist(employee3);

		   em.getTransaction().commit();
		   em.close();
		   emf.close();
		
	}
}
