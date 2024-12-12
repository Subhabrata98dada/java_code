package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoClass1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Student_AUTO s1=new Student_AUTO("raja",75.5);
		Student_AUTO s2=new Student_AUTO("joy",85.5);
		et.begin();
		em.persist(s1);
		em.persist(s2);
		et.commit();
	}
}
