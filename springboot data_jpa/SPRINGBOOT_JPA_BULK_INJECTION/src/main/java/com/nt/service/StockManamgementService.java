package com.nt.service;

import java.util.List;

import com.nt.entity.StockInfo;

public interface StockManamgementService {
	public String registerStock(StockInfo info);
	public String registerStocks(List<StockInfo> info);
	public String checkStockAvailability(int stockID);
	public String showStocksCount();
	public Iterable<StockInfo> showAllStock() ;
	public Iterable<StockInfo> showAllStockById(Iterable<Integer> socksId);

}
