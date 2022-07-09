package com.finsol.movie.controller;


import com.finsol.movie.entity.Rating;
import com.finsol.movie.entity.UserRatings;
import com.finsol.movie.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@RequiredArgsConstructor
public class RatingController {

    private final RatingRepository repository;

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return Rating.of(null,movieId,5,"x");
    }

    @GetMapping("user/{userId}")
    public UserRatings getRatingByUser(@PathVariable("userId") String userId){
        List<Rating> byuserId = repository.findByuserId(userId);
        return UserRatings.of(byuserId);
    }
}
