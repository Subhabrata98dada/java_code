package com.hs.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.entities.Hotel;
import com.hs.exception.ResourseNotFoundException;
import com.hs.repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	HotelRepository hotelRepo;
	public Hotel createHote(Hotel hotel)
	{
		String id=UUID.randomUUID().toString();
		hotel.setId(id);
		return hotelRepo.save(hotel);
	}
	
	public Hotel getSingleHotel(String id)
	{
		return hotelRepo.findById(id).orElseThrow(()->new ResourseNotFoundException("The given id not present"));
	}
	public List<Hotel> getAllHotel()
	{
		return hotelRepo.findAll();
	}
}
