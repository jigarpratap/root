package com.blog.blogdetails.Controller;

import java.util.List;

//import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blogdetails.entity.Blog;
import com.blog.blogdetails.service.BlogServiceImpl;

@RestController
@RequestMapping("/blog")
public class BlogController {
      @Autowired
      BlogServiceImpl blogServiceImpl;
       @GetMapping
      public ResponseEntity<List<Blog>> getAllBlogs(){
        return new ResponseEntity<>(blogServiceImpl.getAllBlogs(),HttpStatus.OK);
      }
      @GetMapping("/{id}")
      public ResponseEntity<Blog> findBlog(@PathVariable String id){
         Blog b=blogServiceImpl.findBlog(id);
         if(b!=null){
            return new ResponseEntity<Blog>(b,HttpStatus.OK);
         }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
      }
       @PostMapping
      public ResponseEntity<Blog> add(@RequestBody Blog b){
        Blog bb=blogServiceImpl.add(b);
        if(bb==null){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(HttpStatus.OK);
        }
      }

}
