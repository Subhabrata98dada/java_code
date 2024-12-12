package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.BankAccountRepository;

@Service
public class BankServiceImplementation implements BankServiceInterface {
	
	@Autowired
	private BankAccountRepository bankrepo;

	@Override
	public String registerAccount(BankAccount account) {
		long id= bankrepo.save(account).getAccountNumber();
		
	return "bank account created with account number "+id;
	}

	@Override
	public String withDraw(Long accountNumber, Double ammount) {
		Optional<BankAccount> opt=bankrepo.findById(accountNumber);
		if(opt.isPresent())
		{
			BankAccount account=opt.get();
			account.setBalanace(account.getBalanace()-ammount);
			bankrepo.save(account);
			return "back account is saved with id "+account.getAccountNumber()+" with ammount "+account.getBalanace();
		}
		return "bank account not found with id +" + accountNumber;
	}

	@Override
	public String deposite(Long accountNumber, Double diposite) {
		Optional<BankAccount> opt=bankrepo.findById(accountNumber);
		if(opt.isPresent())
		{
			BankAccount account=opt.get();
			account.setBalanace(account.getBalanace()+diposite);
			bankrepo.save(account);
			return "back account is saved with id "+account.getAccountNumber()+" with ammount "+account.getBalanace();
		}
		return "bank account not found with id +" + accountNumber;
	}

}
