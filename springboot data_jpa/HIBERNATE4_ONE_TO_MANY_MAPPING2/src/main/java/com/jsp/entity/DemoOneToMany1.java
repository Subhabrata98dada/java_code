package com.jsp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoOneToMany1 {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Account ac1=new Account(1, 20442235985l, 100000000.5);
		Account ac2=new Account(2, 20442235985l, 100000000.5);
		Account ac3=new Account(3, 20442235985l, 100000000.5);
		List<Account> l=new ArrayList<Account>();
		l.add(ac3);
		l.add(ac2);
		l.add(ac1);
		Bank b=new Bank(1, "hdfc", "hdfcn001", l);
		et.begin();
		em.persist(b);
		em.persist(ac1);
		em.persist(ac2);
		em.persist(ac3);
		et.commit();
	}
}
