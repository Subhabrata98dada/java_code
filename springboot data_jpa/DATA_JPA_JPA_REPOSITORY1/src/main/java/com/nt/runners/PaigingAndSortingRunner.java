package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
import com.nt.service.StockService;

@Component
public class PaigingAndSortingRunner implements CommandLineRunner {
	
	@Autowired
	private StockService service;
/*	@Override
	public void run(String... args) throws Exception {
		try {
		String msg=	service.removeStocksByIds(List.of(1003,1004,1005));
		System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}  */
	
/*	public void run(String... args) throws Exception {
		try {
		StockInfo stock= new StockInfo(null, null, "BSE", null, null, null, null);
		List<StockInfo> stocks= service.searchStocksByData(stock, true, "price");
		stocks.forEach(i->System.out.println(i));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    */
	
	public void run(String... args) throws Exception {
		try {
		StockInfo opt=service.fetchSockById(1001); //getting proxy object
		System.out.println(opt);
		System.out.println(opt.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}  
	
	

}
