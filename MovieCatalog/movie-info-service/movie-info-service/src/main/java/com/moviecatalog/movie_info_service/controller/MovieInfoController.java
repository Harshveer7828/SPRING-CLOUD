package com.moviecatalog.movie_info_service.controller;

import com.moviecatalog.movie_info_service.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movie")
public class MovieInfoController {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") Long movieId){
        return new Movie("Name for id " + movieId,movieId);
    }
}
