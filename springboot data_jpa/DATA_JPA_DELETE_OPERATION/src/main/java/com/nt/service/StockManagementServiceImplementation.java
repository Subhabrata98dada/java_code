package com.nt.service;

import java.util.List;
import java.util.Optional;

//import org.hibernate.boot.model.naming.IllegalIdentifierException;
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
	public Optional<StockInfo> getStockById(int id) {
		Optional<StockInfo> stock=stockRepository.findById(id);
		//return Optional.of(stock.orElseThrow(() ->new IllegalIdentifierException("Id not found")));
		return stock;
	}

	@Override
	public String fullObjectModificationStock(Integer info) {
		Optional<StockInfo> opt=stockRepository.findById(info);
		if(opt.isPresent())
		{
			StockInfo stock=opt.get();
			stock.setCompanyName("BAJAJ-AUTO");
			stockRepository.save(stock);
			return "full object modified";
		}
		else
		{
			return "object not found";
		}
	}

	@Override
	public String removeStockById(Integer id) {
		Optional<StockInfo> opt=stockRepository.findById(id);
		if(opt.isEmpty())
		{
			return "object with given id not present";
		}
		else {
			stockRepository.deleteById(id);
			return "stock deleted with id "+id;
		}
	}

}
