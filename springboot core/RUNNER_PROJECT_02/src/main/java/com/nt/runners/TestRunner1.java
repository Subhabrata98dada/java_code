package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
//@Order(3)
@Component
public class TestRunner1 implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("command line argument runner class");
//		System.out.println(Arrays.toString(args));
		System.out.println(this.getClass().getName());
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

}
