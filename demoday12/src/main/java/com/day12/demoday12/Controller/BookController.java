package com.day12.demoday12.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day12.demoday12.Entity.BookDay13;
import com.day12.demoday12.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @Autowired 
    BookService bookService;
    @GetMapping
    public List<BookDay13> getAllBooks(){
        return bookService.getAllBooks();
    }
    
    @PostMapping
    public BookDay13 createBooks(@RequestBody BookDay13 book){
        return bookService.createBooks(book);
    }

    @GetMapping("/getbyid/{id}")
    public BookDay13 getBookById(@PathVariable Long id){
        return bookService.bookById(id);
    }

    @PutMapping("/update/{id}")
    public BookDay13 UpdateEmployee(@PathVariable Long id,@RequestBody BookDay13 book){
        return bookService.updateBooks(id, book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
         bookService.deleteById(id);
    }




}
