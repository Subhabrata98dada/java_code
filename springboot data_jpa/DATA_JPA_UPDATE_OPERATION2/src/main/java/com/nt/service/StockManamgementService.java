package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.StockInfo;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public interface StockManamgementService {
	public String registerStock(StockInfo info);
	public String registerStocks(List<StockInfo> info);
	public String checkStockAvailability(int stockID);
	public Optional<StockInfo> getStockById(int id);
	public String fullObjectModificationStock(Integer id);

}
