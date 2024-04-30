package com.example.demox.service.impl;

import com.example.demox.Pojo.GroundPojo;
import com.example.demox.Repository.GroundRespository;
import com.example.demox.entity.Ground ;
import com.example.demox.service.GroundService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Setter
@Getter
@Repository
@RequiredArgsConstructor


public class GroundServiceImpl implements GroundService{
    private final GroundRespository groundRespository;
    @Override
    public  void saveData(GroundPojo groundPojo){
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGroundName(groundPojo.getGroundName());
        groundRespository.save(ground);
    }
    public List<Ground> getAll(){
        return groundRespository.findAll();
    }

    @Override
    public void deleteById(int id) {
        groundRespository.deleteById(id);


    }

    @Override
    public Optional<Ground> findById(int id) {
        return Optional.empty();
    }




}
