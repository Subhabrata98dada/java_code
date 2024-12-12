package com.rs.services;

import com.rs.entities.Rating;

import java.util.List;

public interface RatingService {
    String createRating(Rating rating);
    List<Rating> getAllRating();
    Rating getSingleRating(Integer id);
    List<Rating> findRatingByUser(Integer id);
    List<Rating> findRatingByHotel(Integer id);
    Rating deteRating(Integer id);
    Rating updateRating(Rating rating);
}
