package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
import com.nt.service.StockService;

@Component
public class PaigingAndSortingRunner implements CommandLineRunner {
	
	@Autowired
	private StockService service;
	@Override
	public void run(String... args) throws Exception {
//	service.showAllDataSorted(true, "stockName").forEach(i-> System.out.println(i));
		
		Page<StockInfo> page=service.showRecordByPageBySort(1, 2,false);
		System.out.println("current page number "+page.getNumber());
		page.getContent().forEach(i->System.out.println(i));
		System.out.println("Total pages "+ page.getTotalPages());
		System.out.println("pages size "+ page.getSize());
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		
		System.out.println("================================================");
		System.out.println("================================================");
		m1();
		
		

	}
	
	private void m1() {
		Page<StockInfo> page=service.showRecordByPage(1, 2);
		System.out.println("current page number "+page.getNumber());
		page.getContent().forEach(i->System.out.println(i));
		System.out.println("Total pages "+ page.getTotalPages());
		System.out.println("pages size "+ page.getSize());
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		
	}

}
