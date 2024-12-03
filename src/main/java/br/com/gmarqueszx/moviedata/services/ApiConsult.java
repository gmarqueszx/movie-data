package br.com.gmarqueszx.moviedata.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiConsult {
    private static final Logger logger = LoggerFactory.getLogger(ApiConsult.class);

    public String consultApi(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response != null && response.body() != null) {
                logger.info(response.body());
            } else {
                logger.warn("Response or response body is null");
            }
        } catch (IOException | InterruptedException e) {
            logger.error("Error during API call", e);
        }

        return response != null ? response.body() : null;
    }
}
