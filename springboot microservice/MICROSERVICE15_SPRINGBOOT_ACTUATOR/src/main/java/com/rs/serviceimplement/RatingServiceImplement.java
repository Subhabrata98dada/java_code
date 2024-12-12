package com.rs.serviceimplement;

import com.rs.entities.Rating;
import com.rs.exception.RatingNotFoundxception;
import com.rs.repository.RatingRepository;
import com.rs.services.RatingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RatingServiceImplement implements RatingService {
    @Autowired
    private RatingRepository ratingRepo;
    @Override
    public String createRating(Rating rating) {
        log.info("Service Layer for add ratings");
        String msg="Rating saved with id : "+ratingRepo.save(rating).getId();
        log.info("Rating saved into database");
        return msg;
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public Rating getSingleRating(Integer id) {
        Optional<Rating> opt=ratingRepo.findById(id);
        return opt.orElseThrow(()->new RatingNotFoundxception("The id given by user not present : "+id));
    }

    @Override
    public List<Rating> findRatingByUser(Integer id) {
        log.info("Calling repo class custom method");
        List<Rating> l=ratingRepo.findRatingByUserid(id);
        log.info("received the list of rating as per the users");
        return  l;
    }

    @Override
    public List<Rating> findRatingByHotel(Integer id) {
        log.info("Request received by service layer for find rating with respect to Hotel");
        List<Rating> l=ratingRepo.findRatingByHotelid(id);
        log.info("Data received for hotel");
        return l;
    }

    @Override
    public Rating deteRating(Integer id) {
        log.info("service layer for delete rating");
        Optional<Rating> opt=ratingRepo.findById(id);
        if(opt.isEmpty()) throw new RatingNotFoundxception("The rating is not present with id :"+id);
        Rating r=opt.get();
        ratingRepo.delete(r);
        log.info("Rating deleted");
        return r;
    }

    @Override
    public Rating updateRating(Rating rating) {
        log.info("service layer for update rating");
        Optional<Rating> opt=ratingRepo.findById(rating.getId());
        if(opt.isEmpty()) throw new RatingNotFoundxception("The rating is not present with id :"+rating.getId());
        Rating r=opt.get();
        ratingRepo.save(rating);
        return rating;
    }
}
