package com.moviecatalog.movie_catalog_service.model;

import java.util.List;

public class UserRating {
    private Long userId;
    private List<Rating> ratings;


    public UserRating() {
    }

    public UserRating(Long userId, List<Rating> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
