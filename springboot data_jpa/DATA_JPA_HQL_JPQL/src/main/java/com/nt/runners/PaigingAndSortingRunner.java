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
//		repository.showAllStocks().forEach(i->System.out.println(i));
//		repository.fetchAllStockByPriceRange3(500.0, 3600.5).forEach(i->System.out.println(i));
//		repository.showStockByCompanyNames("tata", "Sb").forEach(i->System.out.println(i));
//		repository.selectStockByExchangeName("BSE").forEach(i->System.out.println(Arrays.toString(i)));
//       System.out.println( repository.noOfRecord());
		Object st=repository.aggriageteFunction();
		Object rowData[]=(Object[])st;
		System.out.println(Arrays.toString(rowData));
		
		
	}
	

}
