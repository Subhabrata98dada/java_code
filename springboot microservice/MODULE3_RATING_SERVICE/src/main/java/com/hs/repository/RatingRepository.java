package com.hs.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hs.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating,String>{
	List<Rating> findByUserId(String id);
	List<Rating> findByHotelId(String id);
}
