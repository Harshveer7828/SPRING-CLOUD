package com.moviecatalog.movie_catalog_service.controller;

import com.moviecatalog.movie_catalog_service.model.Movie;
import com.moviecatalog.movie_catalog_service.model.MovieCatalogItem;
import com.moviecatalog.movie_catalog_service.model.Rating;
import com.moviecatalog.movie_catalog_service.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<MovieCatalogItem> getCatalog(@PathVariable("userId") String userId) {
        UserRating userRating = restTemplate.getForObject("http://rating-data-service/rating/user/" + userId, UserRating.class);

        return userRating.getRatings().stream()
                .map(rating -> {
                    Movie movie = restTemplate.getForObject("http://movie-info-service/movie/" + rating.getMovieId(), Movie.class);
                    return new MovieCatalogItem(movie.getName(), "Description", rating.getRating());
                })
                .collect(Collectors.toList());
    }


}
