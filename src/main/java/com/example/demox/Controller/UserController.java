package com.example.demox.Controller;

import com.example.demox.Pojo.UserPojo;
import com.example.demox.entity.User;
import com.example.demox.service.UserService;
import com.example.demox.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody UserPojo userPojo) {
        this.userService.saveUser(userPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }

    @GetMapping
    public GlobalApiResponse<List<User>> getUser() {
        return GlobalApiResponse.
                <List<User>>builder()
                .data(this.userService.getAll())
                .statusCode(200)
                .message("Data retreived successfully")
                .build();


    }
//    @PostMapping
//    public void saveUser(@RequestBody UserPojo userPojo) {
//        this.userService.saveUser(userPojo);
//    }
//
//    @GetMapping
//    public List<User> getAllUser() {
//        return userService.getAll();
////
//    }
}