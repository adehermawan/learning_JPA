package com.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.jpa.entity.NonTrainingStudent;
import com.learning.jpa.entity.TrainingStudent;

public class JoinedTableStudent {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning_JPA");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	// Training Student Entity
	TrainingStudent ts1 = new TrainingStudent(1, "Andi", "java", "Jakarta");
	TrainingStudent ts2 = new TrainingStudent(2, "Robet", "Android", "Papua");
	
	// Non training student
	NonTrainingStudent nts1 = new NonTrainingStudent(3, "Ani", "Develope Mobile Apps");
	NonTrainingStudent nts2 = new NonTrainingStudent(4, "Warren", "Investment");
	
	// stroing all entities
	em.persist(ts1);
	em.persist(ts2);
	em.persist(nts1);
	em.persist(nts2);
	
	em.getTransaction().commit();
	em.close();
	emf.close();
}
}
