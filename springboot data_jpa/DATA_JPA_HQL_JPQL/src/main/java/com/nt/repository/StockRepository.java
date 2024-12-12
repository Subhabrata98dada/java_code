package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.StockInfo;

public interface StockRepository extends JpaRepository<StockInfo, Integer> {
//	@Query("from StockInfo")
	@Query("select st from StockInfo as st")
	List<StockInfo> showAllStocks();
	
	
	@Query("from StockInfo where price>=?1 and price<=?2")
	List<StockInfo> fetchAllStockByPriceRange(Double start, double end);
	        //or
	@Query("from StockInfo where price>=:min and price<=:max")
	List<StockInfo> fetchAllStockByPriceRange2(@Param("min") Double start,@Param("max") Double end);
	         //or
	// enable rigt click on project
	// go to compiler 
	// enable store information about the method parameter via reflection api
	@Query("from StockInfo where price>=:start and price<=:end")
	List<StockInfo> fetchAllStockByPriceRange3(Double start,Double end);
	
	@Query("from StockInfo where companyName in(:comp1,:comp2) order by companyName")
	List<StockInfo> showStockByCompanyNames(String comp1,String comp2);
	
	@Query("select stockName,price from StockInfo where exchangeName like :exchange")
	List<Object[]> selectStockByExchangeName(String exchange);
	
	@Query("select count(*) from StockInfo")
	int noOfRecord();
	
	@Query("select max(price),min(price),avg(price) from StockInfo")
	Object aggriageteFunction();
	
}
