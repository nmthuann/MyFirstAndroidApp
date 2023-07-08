package com.example.myfirstapp.Model.JobPost;

public class JobPost {
    private int resourceId;
    private String jobPostTitle;

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getJobPostTitle() {
        return jobPostTitle;
    }

    public void setJobPostTitle(String jobPostTitle) {
        this.jobPostTitle = jobPostTitle;
    }

    public String getAuthorJobPost() {
        return authorJobPost;
    }

    public void setAuthorJobPost(String authorJobPost) {
        this.authorJobPost = authorJobPost;
    }

    public String getDescriptionJobPost() {
        return descriptionJobPost;
    }

    public void setDescriptionJobPost(String descriptionJobPost) {
        this.descriptionJobPost = descriptionJobPost;
    }

    public String getPriceJobPost() {
        return priceJobPost;
    }

    public void setPriceJobPost(String priceJobPost) {
        this.priceJobPost = priceJobPost;
    }

    private String authorJobPost;
    private String descriptionJobPost;
    private String priceJobPost;

    public JobPost(int resourceId, String jobPostTitle, String authorJobPost, String descriptionJobPost, String priceJobPost) {
        this.resourceId = resourceId;
        this.jobPostTitle = jobPostTitle;
        this.authorJobPost = authorJobPost;
        this.descriptionJobPost = descriptionJobPost;
        this.priceJobPost = priceJobPost;
    }
}
