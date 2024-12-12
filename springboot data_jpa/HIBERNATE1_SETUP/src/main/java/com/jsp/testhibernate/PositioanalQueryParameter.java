package com.jsp.testhibernate;

import com.jsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PositioanalQueryParameter {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select s from Student s where s.roll=?1");
		q.setParameter(1, 2);
		Student s=(Student) q.getSingleResult();
		System.out.println(s);
	}

}
