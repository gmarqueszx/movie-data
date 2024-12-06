package br.com.gmarqueszx.moviedata.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConvert implements IJsonConvert {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T convertJson(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
