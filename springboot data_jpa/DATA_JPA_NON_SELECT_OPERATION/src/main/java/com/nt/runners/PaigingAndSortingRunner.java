package com.nt.runners;

import java.util.Arrays;
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

//		int rowcount=repository.updateStockPrice(10.0, "NSE");
//		System.out.println("No of row updated "+rowcount);
		
//		int rowcount=repository.removeStockByPriceRange(500.0, 1000.0);
//		System.out.println("No of row updated "+rowcount);
		
		int count=repository.cretaTempTable();
		System.out.println(count +" table created");
		
	}
	

}
