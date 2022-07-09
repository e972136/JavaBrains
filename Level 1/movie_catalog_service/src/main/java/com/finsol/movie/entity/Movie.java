package com.finsol.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@Builder
@NoArgsConstructor
public class Movie {
    String movieId;
    String name;
    String description;
}
