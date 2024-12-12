package com.rs.controllers;

import com.rs.entities.Rating;
import com.rs.services.RatingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@Slf4j
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<String> addRating(@RequestBody Rating rating)
    {
        log.info("Request mapped for add rating");
        String msg=ratingService.createRating(rating);
        log.info("Return response to user");
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }

    @GetMapping
    public List<Rating> getAllRating()
    {
        log.info("Request for all rating has been mapped");
        List<Rating> l=ratingService.getAllRating();
        log.info("Returning the response to user");
        return l;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getSingleRating(@PathVariable Integer id)
    {
        log.info("request mapped with controller layer now sending request to service layer");
        Rating r=ratingService.getSingleRating(id);
        log.info("Rating fetched from service and sending to user");
        return new ResponseEntity<Rating>(r,HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Rating>> findRatingByUser(@PathVariable Integer id)
    {
        log.info("Request mapped to get rating as per user");
        List<Rating> l=ratingService.findRatingByUser(id);
        log.info("list of rating as per user is fetched");
        return new ResponseEntity<List<Rating>>(l,HttpStatus.OK);
    }

    @GetMapping("/hotel/{id}")
    public ResponseEntity<List<Rating>> findRatingByHotel(@PathVariable Integer id)
    {
        log.info("request mapped for fetch rating for hotel");
        List<Rating> l=ratingService.findRatingByHotel(id);
        log.info("list of rating received by controller layer");
        return  new ResponseEntity<List<Rating>>(l,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Rating> deleteRating(@PathVariable Integer id)
    {
        log.info("mapped request to delete rating");
        Rating r=ratingService.deteRating(id);
        log.info("service layer executed confirm from control layer");
        return new ResponseEntity<Rating>(r,HttpStatus.OK);
    }

    @PutMapping
    ResponseEntity<Rating> updateRating(@RequestBody Rating rating)
    {
        log.info("request for update mapped");
        Rating r=ratingService.updateRating(rating);
        log.info("data updated");
        return new ResponseEntity<Rating>(r,HttpStatus.OK);
    }


}
