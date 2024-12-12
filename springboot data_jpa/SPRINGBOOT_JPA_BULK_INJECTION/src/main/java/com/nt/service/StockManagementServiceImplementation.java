package com.nt.service;

import java.util.List;

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

	@Override
	public String registerStocks(List<StockInfo> info) {
		
		stockRepository.saveAll(info);
		return info.size()+" numbers of record inserted";
	}

	@Override
	public String checkStockAvailability(int stockID) {
		boolean b=stockRepository.existsById(stockID);
		String result= (b)? "stock exist": "not exist";
		return result;
	}

	@Override
	public String showStocksCount() {
		long count=stockRepository.count();
		return "number of stocks registered is "+count;
	}

	@Override
	public Iterable<StockInfo> showAllStock() {
		Iterable<StockInfo> stocks=stockRepository.findAll();
		return stocks;
	}

	@Override
	public Iterable<StockInfo> showAllStockById(Iterable<Integer> socksId) {
		Iterable<StockInfo> stocks=stockRepository.findAllById(socksId);
		return stocks;
	}

}
