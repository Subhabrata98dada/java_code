package com.hs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hs.entities.Hotel;
import com.hs.entities.Rating;
import com.hs.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<Rating> addRating(@RequestBody Rating rating)
	{
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.createrating(rating));
//		return ResponseEntity.ok(rating);
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating()
	{
		return ResponseEntity.ok(ratingService.getAllRating());
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<List<Rating>> getAllRatingByUser(@PathVariable String id)
	{
		List<Rating> al=ratingService.findByUser(id);
		ResponseEntity<List<Rating>> re=ResponseEntity.ok(al);
		return re;
	}
	
	@GetMapping("/hotel/{id}")
	public ResponseEntity<List<Rating>> getAllRatingByHotel(@PathVariable String id)
	{
		return ResponseEntity.ok(ratingService.getAllRatingByHotel(id));
	}
	
	
	
}
