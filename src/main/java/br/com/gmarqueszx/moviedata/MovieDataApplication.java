package br.com.gmarqueszx.moviedata;

import br.com.gmarqueszx.moviedata.services.ViewMovieData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieDataApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ViewMovieData viewMovieData = new ViewMovieData();
		viewMovieData.viewMovieData();

	}
}
