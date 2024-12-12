package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.StockInfo;

public interface StockService {
	
	public Iterable<StockInfo> showAllDataSorted(boolean ascOrder, String ...prper);
	public Page<StockInfo> showRecordByPage(int pageNo,int pageSize);
	Page<StockInfo> showRecordByPageBySort(int pageNo, int pageSize,boolean ascOrder);

}
