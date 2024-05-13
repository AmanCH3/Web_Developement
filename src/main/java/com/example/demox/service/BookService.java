package com.example.demox.service;

import com.example.demox.Pojo.BookPojo;
import com.example.demox.entity.Book;
import com.example.demox.entity.Ground;
import com.example.demox.projection.BookProjection;

import java.util.List;

public interface BookService {
    Book saveData(BookPojo bookpojo);
    List<Ground> findAll() ;
    List<BookProjection> findAll2() ;

    void deleteAll(BookPojo bookPojo) ;

}

