package br.com.gmarqueszx.moviedata.services;

public interface IJsonConvert {
    public <T> T convertJson(String json, Class<T> clazz);
}
