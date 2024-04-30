package com.example.demox.Controller;

import com.example.demox.Pojo.BookPojo;
import com.example.demox.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public void saveBook(@RequestBody BookPojo bookPojo) {
        bookService.saveData(bookPojo);
    }
}
