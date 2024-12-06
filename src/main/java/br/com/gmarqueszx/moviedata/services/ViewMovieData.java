package br.com.gmarqueszx.moviedata.services;


import br.com.gmarqueszx.moviedata.models.MoviesData;
import br.com.gmarqueszx.moviedata.models.PageData;

import java.util.Scanner;

import java.io.IOException;

public class ViewMovieData {
    public void viewMovieData() throws IOException {
        ApiConsult apiConsult = new ApiConsult();

        String apiKey = ConfigLoader.getApiKey();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        String movieName = scanner.nextLine();

        String url = "https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + movieName;
        String responseJson = apiConsult.consultApi(url);

        JsonConvert jsonConvert = new JsonConvert();
        PageData pageData = jsonConvert.convertJson(responseJson, PageData.class);

        if (pageData != null && pageData.results() != null) {
            for (MoviesData movie : pageData.results()) {
                System.out.println("Title: " + movie.title());
                System.out.println("Overview: " + movie.overview());
                System.out.println("Release Date: " + movie.releaseDate());
                System.out.println("Vote Average: " + movie.voteAverage());
                System.out.println("Vote Count: " + movie.voteCount());
                System.out.println("---------------------");
            }
        } else {
            System.out.println("No results found.");
        }

    }
}
