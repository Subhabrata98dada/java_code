package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DemoManyToOne2 {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		Review r=em.find(Review.class, 1);
		System.out.println(r);
	}
}
