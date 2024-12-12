package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoManyToOne1 {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Product p=new Product(1, "mobile", 20000.5);
		Review r1=new Review(1,"good","working well", p);
		Review r2=new Review(2,"not good","heating issue on product", p);
		Review r3=new Review(3,"ok","managable not worth of 20000", p);
		et.begin();
		em.persist(r3);
		em.persist(r2);
		em.persist(r1);
		em.persist(p);
		et.commit();
	}
}
