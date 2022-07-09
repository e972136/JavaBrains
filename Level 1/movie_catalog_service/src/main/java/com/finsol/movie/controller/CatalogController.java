package com.finsol.movie.controller;

import com.finsol.movie.entity.CatalogItem;
import com.finsol.movie.entity.Movie;
import com.finsol.movie.entity.Rating;
import com.finsol.movie.entity.UserRatings;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
@RequiredArgsConstructor
public class CatalogController {

    private final RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        UserRatings userRatings = restTemplate.getForObject("http://movie-ratings-service/ratings/user/" + userId, UserRatings.class);

        return userRatings.getRatings().stream().
                map(r -> {
                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + r.getMoveId(), Movie.class);
                    return CatalogItem.of(movie.getName(), movie.getDescription(), r.getRating());
                }).
                collect(Collectors.toList());
    }
}
