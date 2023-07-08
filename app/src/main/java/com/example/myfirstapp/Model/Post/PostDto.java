package com.example.myfirstapp.Model.Post;

import com.example.myfirstapp.Model.Category.CategoryDto;

public class PostDto {
    private Long jobPostId;
    private CategoryDto category;
    private String jobPostName;
    private int vote;

    // Constructors
    public PostDto() {
    }

    public PostDto(Long jobPostId, CategoryDto category, String jobPostName, int vote) {
        this.jobPostId = jobPostId;
        this.category = category;
        this.jobPostName = jobPostName;
        this.vote = vote;
    }

    // Getters and setters
    public Long getJobPostId() {
        return jobPostId;
    }

    public void setJobPostId(Long jobPostId) {
        this.jobPostId = jobPostId;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public String getJobPostName() {
        return jobPostName;
    }

    public void setJobPostName(String jobPostName) {
        this.jobPostName = jobPostName;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}