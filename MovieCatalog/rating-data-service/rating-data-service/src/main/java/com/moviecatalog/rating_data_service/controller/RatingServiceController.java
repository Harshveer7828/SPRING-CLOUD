package com.moviecatalog.rating_data_service.controller;

import com.moviecatalog.rating_data_service.model.Rating;
import com.moviecatalog.rating_data_service.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingServiceController {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") Long movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") Long userId){
        // using this we can return the object of array which is correct approach instead of return the list
        List<Rating> ratingList = List.of(
                new Rating(1L, 4),
                new Rating(2L, 5)
        );
        UserRating userRating = new UserRating();
        userRating.setRatings(ratingList);
        return userRating;
    }

}
