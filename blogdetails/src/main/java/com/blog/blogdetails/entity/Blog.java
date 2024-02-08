package com.blog.blogdetails.entity;

public class Blog {
      private String title;
      private String content;
      private String contentDeatils;
      
    public Blog() {
    }

    public Blog(String title, String content, String contentDeatils) {
        this.title = title;
        this.content = content;
        this.contentDeatils = contentDeatils;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentDeatils() {
        return contentDeatils;
    }

    public void setContentDeatils(String contentDeatils) {
        this.contentDeatils = contentDeatils;
    }
    
      
}
