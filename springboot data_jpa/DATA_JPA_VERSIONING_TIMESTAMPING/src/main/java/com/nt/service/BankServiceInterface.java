package com.nt.service;

import com.nt.entity.BankAccount;

public interface BankServiceInterface {
	
	String registerAccount(BankAccount account);
	String withDraw(Long accountNumber,Double ammount);
	String deposite(Long accountNumber,Double diposite);

}
