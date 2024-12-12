package com.hs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.entities.Rating;
import com.hs.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
	private RatingRepository ratingRepo;
	public Rating createrating(Rating rating)
	{
		return  ratingRepo.save(rating);
	}
	
	public List<Rating> findByUser(String userId)
	{
		return ratingRepo.findByUserId(userId);
	}
	
	public List<Rating> findByHotel(String hotelId){
		return ratingRepo.findByHotelId(hotelId);
	}
	
	public List<Rating> getAllRating()
	{
		return ratingRepo.findAll();
	}
	
	public List<Rating> getAllRatingByUser(String id)
	{
		return ratingRepo.findByUserId(id);
	}
	
	public List<Rating> getAllRatingByHotel(String id)
	{
		return ratingRepo.findByHotelId(id);
	}
}
