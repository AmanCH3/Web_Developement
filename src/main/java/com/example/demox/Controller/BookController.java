package com.example.demox.Controller;

import com.example.demox.Pojo.BookPojo;
import com.example.demox.entity.Ground;
import com.example.demox.service.BookService;
import com.example.demox.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.codec.ServerSentEvent.builder;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

//    @PostMapping
//    public void saveBook(@RequestBody BookPojo bookPojo) {
//        bookService.saveData(bookPojo);
//    }
//
//    @GetMapping
//    public List <Book> getAllBooks(){
//        return bookService.findAll() ;
//    }

    @GetMapping
    public GlobalApiResponse<List<Ground>> getData() {
        return GlobalApiResponse.
                <List<Ground>>builder()
                .data(this.bookService.findAll())
                .statusCode(200)
                .message("data retreived successfully")
                .build();
    }

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody BookPojo bookPojo) {
        this.bookService.saveData(bookPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }


}
