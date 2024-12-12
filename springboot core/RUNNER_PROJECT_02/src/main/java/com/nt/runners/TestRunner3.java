package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(-10)
public class TestRunner3 implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("commend linen numnner 2");
		System.out.println(this.getClass().getName());
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
