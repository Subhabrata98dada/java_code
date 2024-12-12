package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nt.entity.StockInfo;

public interface StockRepository extends JpaRepository<StockInfo, Integer> {
	List<StockInfo> findByexchangeName(String exchange);
	List<StockInfo> readByExchangeNameStartingWith(String s);
	List<StockInfo> getByStockTypeEndingWith(String s);
	List<StockInfo> getByExchangeNameContainingIgnoreCase(String s);
	List<StockInfo> getByExchangeNameIn(List<String> s);
	List<StockInfo> findByPriceGreaterThanAndPriceLessThan(double start,double end);
}
