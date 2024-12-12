package com.nt.runners;


import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
//import com.nt.entity.StockInfo;
import com.nt.service.StockManamgementService;

@Component
public class CrudRepositoryTest implements CommandLineRunner {
	
	@Autowired
	private StockManamgementService stockService;

	@Override
	public void run(String... args) throws Exception {
		try {
			//List<StockInfo> list=new ArrayList<StockInfo>();
			StockInfo info1=new StockInfo("IKEA", "BSE",
					"FURNITURE", "SB", 986.60, 350.8);
			StockInfo info2=new StockInfo("HERO", "BSE",
					"AUTOMOBILE", "HERO-MOTOR", 9816.50, 3560.8);
			StockInfo info3=new StockInfo("TREND", "NSE",
					"FASHION", "RELIENCE", 176.50, 9350.8);
			
		String registerMessage=	stockService.registerStocks(List.of(info1,info2,info3));
		System.out.println(registerMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
/*	@Override
	public void run(String... args) throws Exception {
		try {
			
			
		String registerMessage=	stockService.showStocksCount();
		System.out.println(registerMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
/*	public void run(String... args) throws Exception {
		try {
			
			
		Iterable< StockInfo> stocks=stockService.showAllStock();
		stocks.forEach(stock-> System.out.println(stock));
		} catch (Exception e) {
			e.printStackTrace();
		}
   }*/
	
//	public void run(String... args) throws Exception {
//		try {
//			
//			
//		Iterable< StockInfo> stocks=stockService.showAllStockById(List.of(1000,1001));
//		stocks.forEach(stock-> System.out.println(stock));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//   }
}
