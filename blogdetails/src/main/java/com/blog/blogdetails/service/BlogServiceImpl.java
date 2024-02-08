package com.blog.blogdetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.blogdetails.entity.Blog;
@Service
public class BlogServiceImpl implements  BlogService{
  private static List<Blog> list=new ArrayList<>();
    
      static{
              list.add(new Blog("A", "A is for apple", "AA123"));
              list.add(new Blog("B", "B is for ball", "BB123"));
      }
    @Override
    public List<Blog> getAllBlogs() {
        
         return list;
    }

    @Override
    public Blog findBlog(String id) {
        
        for(Blog b:list){
            if(b.getTitle().toLowerCase().equals(id.toLowerCase())){
                 return b;
            }
        }
        return null;
        
    }

    @Override
    public Blog add(Blog b) {
    
           for(Blog bo:list){
            if(bo.getTitle().toLowerCase()==b.getTitle().toLowerCase()){
                return null;
            }
           }
         list.add(b);
         return b;
    }
    
}
