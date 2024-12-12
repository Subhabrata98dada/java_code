package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoOneToMany3 {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Bank b= em.find(Bank.class, 1);
		b.getAccounts().remove(2);
		et.begin();
		em.merge(b);
		et.commit();
	}
}
