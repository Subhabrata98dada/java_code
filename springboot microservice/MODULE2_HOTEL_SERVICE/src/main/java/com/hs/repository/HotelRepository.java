package com.hs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hs.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
