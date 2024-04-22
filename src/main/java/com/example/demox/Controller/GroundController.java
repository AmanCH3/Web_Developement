package com.example.demox.Controller;

import com.example.demox.Pojo.GroundPojo;
import com.example.demox.service.GroundService;
import com.example.demo.entity.Ground;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/save")
@RequiredArgsConstructor
//@RequiredArgsConstructor

public class GroundController {
    private final GroundService groundService;
    @GetMapping("/get")
    public List<Ground> getData(){
        return this.groundService.getAll() ;
    }

    @PostMapping("/save")
    public void save(@RequestBody Ground ground) {
        this.groundService.saveData(new GroundPojo());
    }



}
