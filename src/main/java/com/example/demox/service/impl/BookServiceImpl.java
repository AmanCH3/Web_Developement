package com.example.demox.service.impl;

import com.example.demox.Pojo.BookPojo;
import com.example.demox.Repository.BookRespository;
import com.example.demox.Repository.GroundRespository;
import com.example.demox.Repository.UserRespository;
import com.example.demox.entity.Book;
import com.example.demox.entity.Ground;
import com.example.demox.entity.User;
import com.example.demox.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRespository bookRespository;
    private final GroundRespository groundRespository;
    private final UserRespository userRespository;


    @Override
    public void saveData(BookPojo bookPojo) {
        Book book = new Book();
//        book.setId(bookPojo.getId()) ;
//        book.setGroundId(bookPojo.getId()) ;
        book.setName(bookPojo.getBookName());
        Ground ground = groundRespository.findById(bookPojo.getGroundId()).get();
        book.setGround(ground);

        User user = userRespository.findById(bookPojo.getUserId()).get();
        book.setUser(user);
        bookRespository.save(book);


    }
}
