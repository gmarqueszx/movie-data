package br.com.gmarqueszx.moviedata.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MoviesData(String title,
                         String overview,
                         @JsonAlias("release_date") String releaseDate,
                         @JsonAlias("vote_average") double voteAverage,
                         @JsonAlias("vote_count") int voteCount) { }
