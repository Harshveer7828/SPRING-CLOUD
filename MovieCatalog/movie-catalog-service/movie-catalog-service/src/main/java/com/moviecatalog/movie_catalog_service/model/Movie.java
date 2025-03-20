package com.moviecatalog.movie_catalog_service.model;

public class Movie {
    private String name;
    private Long movieId;

    public Movie() {}

    public Movie(String name, Long movieId) {
        this.name = name;
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
