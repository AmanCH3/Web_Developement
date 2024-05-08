package com.example.demox.service.impl;

import com.example.demox.Pojo.UserPojo;
import com.example.demox.Repository.UserRespository;
import com.example.demox.entity.User;
import com.example.demox.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Repository
@RequiredArgsConstructor


public class UserServiceImpl implements UserService {

    private final UserRespository userRespository;

    @Override
    public void saveUser(UserPojo userPojo) {
        User user = new User() ;
        user.setName(userPojo.getUsername());
        user.setId(user.getId());

        userRespository.save(user) ;
    }

    @Override
    public List<User> getAll() {
        return userRespository.findAll();
    }
}
