package com.example.mambosdabanda.api;

import com.example.mambosdabanda.model.Loja;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("loja")
    public Call<List<Loja>> getLojas();
}
