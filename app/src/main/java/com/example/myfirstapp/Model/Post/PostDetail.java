package com.example.myfirstapp.Model.Post;

public class PostDetail {

    private int resourceId;
    private String postDetailTitle;
    private String author;
    private String description;

    public PostDetail(int resourceId, String postDetailTitle, String author, String description, String price) {
        this.resourceId = resourceId;
        this.postDetailTitle = postDetailTitle;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getPostDetailTitle() {
        return postDetailTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    private String price;

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public void setPostDetailTitle(String postDetailTitle) {
        this.postDetailTitle = postDetailTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
