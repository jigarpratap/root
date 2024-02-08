package com.day12.demoday12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day12.demoday12.Entity.BookDay13;
import com.day12.demoday12.Respository.BookRespository;

@Service
public class BookService {
    
    @Autowired
    private BookRespository bookRespository;
    public List<BookDay13> getAllBooks(){
        return bookRespository.findAll();
    }
    
    public BookDay13 bookById(Long id){
        return bookRespository.findById(id).get();
    }
    public BookDay13 updateBooks(Long id,BookDay13 book){
        BookDay13 e=bookRespository.findById(id).get();
        if(e!=null){
             e.setAuthor(book.getAuthor());
             e.setTitle(book.getTitle());
             e.setQuantity(book.getQuantity());
             e.setIsAvailable(book.getIsAvailable());
             bookRespository.save(e);
            return e;
        }else {
             return null;
        }
    }

    public void deleteById(Long id){
        bookRespository.deleteById(id);
    }

    public BookDay13 createBooks(BookDay13 emp){
        return bookRespository.save(emp);
    }
}
