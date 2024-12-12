package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoMain {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Profile f=new Profile(new AccountID(9348338693l,"subah1234@gmail.com"), "subhabrata",25, "male");
		et.begin();
		em.persist(f);
		et.commit();
	}

}
