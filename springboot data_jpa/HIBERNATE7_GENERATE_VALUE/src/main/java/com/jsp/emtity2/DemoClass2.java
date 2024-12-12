package com.jsp.emtity2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoClass2 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subha");
		EntityManager em1= emf.createEntityManager();
		Student_INDENTITY s1=em1.find(Student_INDENTITY.class,1);
		System.out.println(s1);
		EntityManager em2= emf.createEntityManager();
		
		Student_INDENTITY s2= em2.find(Student_INDENTITY.class,1);
		
		System.out.println(s2);
	}
}
