package br.com.gmarqueszx.moviedata.services;


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

        if (responseJson != null) {
            System.out.println(responseJson);
        } else {
            System.out.println("No response received from the API.");
        }
    }
}
