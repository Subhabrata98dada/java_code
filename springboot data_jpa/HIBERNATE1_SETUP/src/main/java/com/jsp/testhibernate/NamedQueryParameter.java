package com.jsp.testhibernate;

import com.jsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class NamedQueryParameter {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select s from Student s where s.roll=:myroll");
		q.setParameter("myroll", 1);
		Student s= (Student) q.getSingleResult();
		System.out.println(s);
	}
}
