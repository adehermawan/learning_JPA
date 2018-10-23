package com.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.entity.FixedTeacher;
import com.learning.jpa.entity.HonorerTeacher;

public class TablePerClassTeacher {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
	EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();
	
	// Fixed enty
	FixedTeacher ft1 = new FixedTeacher(1, "Atu", "Java", "AXA");
	FixedTeacher ft2 = new FixedTeacher(2, "Iman", "Spring", "BCA Life");
	
	// Honorer
	HonorerTeacher ht1 = new HonorerTeacher(3, "Rani", 10);
	HonorerTeacher ht2 = new HonorerTeacher(4, "Golum", 12);
	
	// storing data
	em.persist(ht1);
	em.persist(ht2);
	em.persist(ft1);
	em.persist(ft2);
	
	em.getTransaction().commit();
	em.close();
	emf.close();
}
}
