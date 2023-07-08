package com.example.myfirstapp.API;

//import PostDto;
import com.example.myfirstapp.Model.Category.Category;
import com.example.myfirstapp.Model.Category.CategoryDto;
import com.example.myfirstapp.Model.JobPost.JobPost;
import com.example.myfirstapp.Model.JobPost.JobPostDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiService {


    // Khởi tạo Retrofit instance

    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create(); // transform data Date type check here

    // OkHttpClient client = new OkHttpClient();
    // Tạo API Service
    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://192.168.10.1:8089/post/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

    @GET("posts/get-post-list")
    Call<List<JobPostDto>> getJobPostList();


    @GET("category/Categories")
    Call<List<CategoryDto>> getCategoryList();

    @GET("category/get-categories-name")
    Call<List<String>> getCategoryNameList();

}