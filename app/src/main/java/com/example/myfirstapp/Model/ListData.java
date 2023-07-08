package com.example.myfirstapp.Model;

import com.example.myfirstapp.Model.Category.Category;
import com.example.myfirstapp.Model.JobPost.JobPost;

import java.util.List;

public class ListData {
    public ListData(int type, List<Category> categoryList, List<JobPost> jobPostList) {
        this.type = type;
        this.categoryList = categoryList;
        this.jobPostList = jobPostList;
    }

    private int type;
    private List<Category> categoryList;
    private List<JobPost> jobPostList;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<JobPost> getJobPostList() {
        return jobPostList;
    }

    public void setJobPostList(List<JobPost> jobPostList) {
        this.jobPostList = jobPostList;
    }
}
