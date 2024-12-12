package com.jsp.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DemoOneToMany2 {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("subha");
		EntityManager em= emf.createEntityManager();
		Bank b= em.find(Bank.class,1);
		System.out.println("-------------------");
		System.out.println(b.getId()+" "+b.getName()+" "+b.getIfsc());
		b.getAccounts().forEach(i-> System.out.println(i.getId()+" "+i.getNumber()+" "+i.getBalanace()));
	}

}
