package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeeker;
import com.nt.repository.MarrieageSeekerRepository;

@Service
public class MarriageSeekerImplementation implements MarriageSeekerManagementInterface{
	  @Autowired
      private MarrieageSeekerRepository repo;

	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker) {
		int id=repo.save(seeker).getSid();
		return "marriage seeker is registered with id "+id;
	}

	@Override
	public Optional<MarriageSeeker> getMarriageSeeker(Integer id) {
		
		return repo.findById(id);
	}
	  
	  
}
