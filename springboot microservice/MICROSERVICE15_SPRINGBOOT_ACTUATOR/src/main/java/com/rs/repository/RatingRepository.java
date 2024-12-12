package com.rs.repository;

import com.rs.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,Integer> {
    List<Rating> findRatingByUserid(Integer id);
    List<Rating> findRatingByHotelid(Integer id);
}
