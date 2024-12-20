package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.PersonManageMentService;

@Component
public class MappingRunners implements CommandLineRunner{
	
	@Autowired
	private PersonManageMentService service;

	@Override
	public void run(String... args) throws Exception {
		service.saveDataUsingParent();
		service.saveDataUsingChild();
//		service.loadDataUsingParent();
//		service.loadDataUsingChild();
//		service.addChildToExistParent(2);
//		System.out.println(service.deleteByParent(1));
//		service.deleteAllChildOfparent(2);
	}

}
