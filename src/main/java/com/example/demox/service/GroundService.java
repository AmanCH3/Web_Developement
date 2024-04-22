package com.example.demox.service;


import com.example.demox.Pojo.GroundPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Ground ;

import java.util.List;

@Service
public interface GroundService {
    void saveData(GroundPojo groundPojo);

    List<Ground> getAll();

}
