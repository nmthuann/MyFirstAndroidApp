package com.example.myfirstapp.Model.Category;

import com.example.myfirstapp.Model.Post.Post;

import java.util.List;

public class Category {
    private String categoryName;

    public Category(String categoryName, int resourceId) {
        this.categoryName = categoryName;
        this.resourceId = resourceId;
    }

    private int resourceId;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}





//    private String category_name = "";
//    private List<Post> posts;
//    public Category(String category_name, List<Post> posts) {
//        this.category_name = category_name;
//        this.posts = posts;
//    }
//
//    public String getCategory_name() {
//        return category_name;
//    }
//
//    public void setCategory_name(String category_name) {
//        this.category_name = category_name;
//    }
//
//    public List<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(List<Post> posts) {
//        this.posts = posts;
//    }