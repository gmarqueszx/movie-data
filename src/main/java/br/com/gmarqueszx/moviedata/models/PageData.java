package br.com.gmarqueszx.moviedata.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PageData(int page,
                       List<MoviesData> results) {
}


