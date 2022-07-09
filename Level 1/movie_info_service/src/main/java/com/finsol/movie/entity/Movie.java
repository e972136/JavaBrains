package com.finsol.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor(staticName = "of")
@Builder
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    String movieId;
    String name;
    String description;
}
