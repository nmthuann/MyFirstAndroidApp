package com.example.myfirstapp.Model.JobPost;

import com.example.myfirstapp.Model.Category.CategoryDto;

public class JobPostDto {

    public JobPostDto(String post_name, int price, String description, String profile_user) {
        this.post_name = post_name;
        this.price = price;
        this.description = description;
        this.profile_user = profile_user;
    }

    private String post_name;
    private int price;

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfile_user() {
        return profile_user;
    }

    public void setProfile_user(String profile_user) {
        this.profile_user = profile_user;
    }

    private String description;
    private String profile_user;

}
