package com.nt.runners;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
import com.nt.service.StockManamgementService;

@Component
public class CrudRepositoryTest implements CommandLineRunner {
	
	@Autowired
	private StockManamgementService stockService;

	@Override
	public void run(String... args) throws Exception {
		try {
			StockInfo info=new StockInfo("TCS_tech", "NSE",
					"CONSULTENCY", "TATA", 3986.50, 3500.8);
		String registerMessage=	stockService.registerStock(info);
		System.out.println(registerMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
