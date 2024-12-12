package com.nt.runners;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.nt.service.BankServiceImplementation;

@Component
public class VersioningAndTimeStampingRunner implements CommandLineRunner{
	
	@Autowired
	BankServiceImplementation service;
	
	@Override
	public void run(String... args) throws Exception {
		
//		BankAccount ba=new BankAccount();
//		ba.setHolderName("raja");
//		ba.setBalanace(5000.6);
//		String s=service.registerAccount(ba);
//		System.out.println(s);
//		
		
		service.deposite(1l, 5300.6);
	}
	
	

}
