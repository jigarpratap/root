package com.blog.blogdetails.service;

import java.util.List;

import com.blog.blogdetails.entity.Blog;

public interface BlogService {
    public List<Blog> getAllBlogs();
    public Blog findBlog(String id);
    public  Blog add(Blog b); 
}
