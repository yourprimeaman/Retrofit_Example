package com.retro.retrofit_example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getposts();
}
