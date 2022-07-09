package com.finsol.movie.controller;

import com.finsol.movie.entity.Movie;
import com.finsol.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieInfoController {

    private final MovieRepository  repository;

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        System.out.println("movieId:"+LocalDateTime.now());
        Movie byId = repository.findById(movieId).orElse(null);
        return byId;
    }
}
