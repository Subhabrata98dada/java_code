package com.nt.runners;


import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
//@Order(2)
public class TestRunner2 implements ApplicationRunner,Ordered{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		System.out.println("application argument list");
//		
//		//get non options args
//		List<String> nonoptionsargs=args.getNonOptionArgs();
//		System.out.println("non optional args"+nonoptionsargs);
//		
//		//get optional args.
//		Set<String> optioalargs= args.getOptionNames();
//		
//		System.out.println("---------------------------");
//		System.out.println("optional argument");
//		optioalargs.forEach(a-> System.out.println(a+"----"+ args.getOptionValues(a)));
		System.out.println(this.getClass().getName());
		
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
