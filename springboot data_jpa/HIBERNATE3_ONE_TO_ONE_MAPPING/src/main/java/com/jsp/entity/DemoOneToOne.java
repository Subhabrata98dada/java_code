package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoOneToOne {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		Car c= em.find(Car.class, 1);
		System.out.println(c);
	}
}
