package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.StockInfo;

public interface StockService {
	
	String removeStocksByIds(List<Integer> ids);
	List<StockInfo> searchStocksByData(StockInfo info, boolean asc,String props);
	Optional<StockInfo> findStockById(Integer id);
	StockInfo fetchSockById(Integer id);
}
