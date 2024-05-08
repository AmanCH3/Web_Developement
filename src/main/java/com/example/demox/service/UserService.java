package com.example.demox.service;

import com.example.demox.Pojo.UserPojo;
import com.example.demox.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserService {
   void saveUser(UserPojo userPojo) ;
   List<User> getAll() ;
}
