package com.hs.controllers;

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
import com.hs.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	private HotelService hotelService;
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
	{
		return new ResponseEntity<Hotel>(hotelService.createHote(hotel),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getSingleHotel(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel()
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotel());
	}
}
