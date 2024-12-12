package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.StockInfo;

public interface StockRepository extends CrudRepository<StockInfo, Integer>, 
PagingAndSortingRepository<StockInfo, Integer> {

}
