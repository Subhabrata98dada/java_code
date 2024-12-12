package com.jsp.testhibernate;

import java.util.List;

import com.jsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class GetAllResult {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select s from Student s");
		List<Student> students= q.getResultList();
		students.forEach(i->System.out.println(i));
	}
}
