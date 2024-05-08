package com.example.demox.service;


import com.example.demox.Pojo.RolePojo;
import com.example.demox.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleService {

    void saveData(RolePojo rolePojo) ;
    List<Role> findAll();

}
