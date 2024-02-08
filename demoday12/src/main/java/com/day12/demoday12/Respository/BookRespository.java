package com.day12.demoday12.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day12.demoday12.Entity.BookDay13;

public interface BookRespository extends JpaRepository<BookDay13,Long> {
    
}
