package com.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.entity.NonTeachingStaff;
import com.learning.jpa.entity.TeachingStaff;

public class SingleTableStaff {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	// Teaching Staff entity
	TeachingStaff ts1 = new TeachingStaff(1, "Ade", "Msc", "math");
	TeachingStaff ts2 = new TeachingStaff(2, "Bara", "Bsc", "Economic");
	
	// Non teaching staff
	NonTeachingStaff ns1 = new NonTeachingStaff(3, "Andi", "Account");
	NonTeachingStaff ns2 = new NonTeachingStaff(4, "Sarah", "Office");
	
	// storing all entities
	em.persist(ts1);
	em.persist(ts2);
	em.persist(ns1);
	em.persist(ns2);
	
	em.getTransaction().commit();
	
	em.close();
	emf.close();
	
}
}
