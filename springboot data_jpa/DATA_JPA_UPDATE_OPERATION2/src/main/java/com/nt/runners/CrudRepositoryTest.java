package com.nt.runners;


import java.util.Optional;

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

//	@Override
//	public void run(String... args) throws Exception {
//		try {
//			//List<StockInfo> list=new ArrayList<StockInfo>();
//			StockInfo info1=new StockInfo("wipro_tech", "BSE",
//					"CONSULTENCY", "WIPRO", 986.50, 350.8);
//			StockInfo info2=new StockInfo("bajaj", "BSE",
//					"AUTOMOBILE", "BAJAJ", 9826.50, 3560.8);
//			StockInfo info3=new StockInfo("IKEA", "NSE",
//					"FURNITURE", "SOFT_BANK", 186.50, 9350.8);
//			
//		String registerMessage=	stockService.registerStocks(List.of(info1,info2,info3));
//		System.out.println(registerMessage);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
/*	@Override
	public void run(String... args) throws Exception {
		try {
			
			
		String registerMessage=	stockService.checkStockAvailability(1009);
		System.out.println(registerMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}  */
	
/*	@Override
	public void run(String... args) throws Exception {
		try {
			Optional<StockInfo> stock=stockService.getStockById(1003);
			if(stock.isPresent())
				System.out.println(stock.get());
			else
				System.out.println("the searched stock not present");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} */
	
	@Override
	public void run(String... args) throws Exception {
		try {
			StockInfo s=new StockInfo();
			s.setStockId(1002);
			s.setAvailableUnits(4569.7);
			
			String msg=stockService.fullObjectModificationStock(1002);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
