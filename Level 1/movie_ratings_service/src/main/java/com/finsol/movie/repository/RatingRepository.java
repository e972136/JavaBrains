package com.finsol.movie.repository;

import com.finsol.movie.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,Integer> {
    List<Rating> findByuserId(String userId);
}
