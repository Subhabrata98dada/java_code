package com.nt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.StockInfo;
import com.nt.repository.StockRepository;

//import jakarta.persistence.Embeddable;



@Service
public class StockServiceImplementation implements StockService{
	
	@Autowired
	private StockRepository repository;

	@Override
	public String removeStocksByIds(List<Integer> ids) {
		// load recored by ids
		List<StockInfo> stock_listsInfos= repository.findAllById(ids);
		if(stock_listsInfos.size()>0)
		{
			repository.deleteAllByIdInBatch(ids);
			return stock_listsInfos.size()+" no of records deleted";
		}
		return "no records finds with given ids";
	}

	@Override
	public List<StockInfo> searchStocksByData(StockInfo info, boolean asc,String props) {
		Sort sort=Sort.by(asc? Sort.Direction.ASC : Sort.Direction.DESC ,props);
		Example<StockInfo> example=Example.of(info);
		List<StockInfo> stocks= repository.findAll(example, sort);
		return stocks;
	}

	@Override
	public Optional<StockInfo> findStockById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public StockInfo fetchSockById(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}
	
	
	

}
