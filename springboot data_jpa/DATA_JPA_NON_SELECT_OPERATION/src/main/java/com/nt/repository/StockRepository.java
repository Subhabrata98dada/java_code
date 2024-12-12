package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.StockInfo;

import jakarta.transaction.Transactional;

public interface StockRepository extends JpaRepository<StockInfo, Integer> {
	
	@Query("update StockInfo set price= price +(price * (:percentage /100)) where exchangeName= :exchange")
	@Transactional
	@Modifying
	int updateStockPrice(Double percentage,String exchange);
	
	
	@Query("delete from StockInfo where price>=:start and price<=:end")
	@Transactional
	@Modifying
	int removeStockByPriceRange(Double start,Double end);
	
	@Query(value = "create table temp (col1 varchar(20))",nativeQuery = true)
	@Modifying
	@Transactional
	int cretaTempTable();

}
