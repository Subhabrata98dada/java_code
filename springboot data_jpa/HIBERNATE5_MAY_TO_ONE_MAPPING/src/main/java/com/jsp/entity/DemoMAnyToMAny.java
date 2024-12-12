package com.jsp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DemoMAnyToMAny {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subha");
	}
}
