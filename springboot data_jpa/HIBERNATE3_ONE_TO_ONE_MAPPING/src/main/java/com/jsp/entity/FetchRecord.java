package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
//		Car c= em.find(Car.class,1);
//		System.out.println(c);
		Engine e=em.find(Engine.class,101);
		System.out.println(e.getCar());
//		System.out.println(e);
		
		
	}
}
