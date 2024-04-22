package com.example.demox.service.impl;

import com.example.demox.Pojo.GroundPojo;
import com.example.demox.Repository.GroundRespository;
import com.example.demo.entity.Ground ;
import com.example.demox.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//import com.example.demo.entity.GroundService ;
import java.util.List;
@Service
@RequiredArgsConstructor

public class GroundServiceImpl implements GroundService{
    private final GroundRespository groundRespository;
    @Override
    public  void saveData(GroundPojo groundPojo){
        Ground ground = new Ground();
        ground.setId(ground.getId());
        ground.setGroundName(ground.getGroundName());
        groundRespository.save(ground);
    }
    public List<Ground> getAll(){
        return groundRespository.findAll();
    }
}
