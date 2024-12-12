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


	
	
	
	

}
