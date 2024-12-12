package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.StockInfo;
import com.nt.repository.StockRepository;

@Service
public class StockServiceImplementation implements StockService{
	
	@Autowired
	private StockRepository stockrepository;

	@Override
	public Iterable<StockInfo> showAllDataSorted(boolean ascOrder, String... proper) {
		
		Sort sort=Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC, proper);
		Iterable<StockInfo> list= stockrepository.findAll(sort);
		return list;
	}

	@Override
	public Page<StockInfo> showRecordByPage(int pageNo, int pageSize) {
		Pageable pagable=PageRequest.of(pageNo, pageSize);
		Page<StockInfo> page=stockrepository.findAll(pagable);
		return page;
	}

	@Override
	public Page<StockInfo> showRecordByPageBySort(int pageNo, int pageSize, boolean ascOrder) {
		Sort sort=Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC, "price");
		Pageable pagable=PageRequest.of(pageNo, pageSize,sort);
		Page<StockInfo> page=stockrepository.findAll(pagable);
		return page;
	}
	
	

}
