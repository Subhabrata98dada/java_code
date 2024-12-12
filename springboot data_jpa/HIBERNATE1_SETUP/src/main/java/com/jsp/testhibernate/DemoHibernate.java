package com.jsp.testhibernate;

import com.jsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoHibernate {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Student s=new Student();
		s.setRoll(4);
		s.setName("anil");
		s.setEmail("anil1234@gmail.com");
		s.setHeight(6.2);
		
		et.begin();
		em.persist(s);
		et.commit();
	}
}
