package com.example.movies.services;

import com.example.movies.model.Movie;
import com.example.movies.repo.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> findAllMovies(){
        return repository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return repository.findMovieByImdbId(imdbId);
    }

}
