package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.StockInfo;
import com.nt.repository.StockRepository;

@Service("stockmanagementservice")
public class StockManagementServiceImplementation implements StockManamgementService {
	
	@Autowired
	private StockRepository stockRepository;

	@Override
	public String registerStock(StockInfo info) {
	  StockInfo info1=	stockRepository.save(info);
		return "object is saved with id : "+info1.getStockId();
	}

}
