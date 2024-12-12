package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
import com.nt.repository.StockRepository;
import com.nt.service.StockService;

@Component
public class PaigingAndSortingRunner implements CommandLineRunner {
	
	@Autowired
	StockRepository repository;

	@Override
	public void run(String... args) throws Exception {
//		repository.readByExchangeNameStartingWith("B").forEach(i->System.out.println(i));
//		System.out.println("========================================================");
//		repository.getByStockTypeEndingWith("E").forEach(i->System.out.println(i));
//		System.out.println("========================================================");
		repository.getByExchangeNameContainingIgnoreCase("S").forEach(i->System.out.println(i));
		
//		repository.getByExchangeNameIn(List.of("BSE","NSE")).forEach(i->System.out.println(i));
		
		repository.findByPriceGreaterThanAndPriceLessThan(1000.0, 3500.0).forEach(i->System.out.println(i));
	}
	
//	public void run(String... args) throws Exception {
//		
//		List<StockInfo> stocks=repository.findByexchangeName("BSE");
//		stocks.forEach(i-> System.out.println(i));
//	}  
	
	

}
