package com.example.demox.Controller;

import com.example.demox.Pojo.GroundPojo;
import com.example.demox.entity.Ground;
import com.example.demox.service.GroundService;
import com.example.demox.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor

public class GroundController {

    private final GroundService groundService;

    @GetMapping
    public GlobalApiResponse<List<Ground>> getData() {
        return GlobalApiResponse.
                <List<Ground>>builder()
                .data(this.groundService.getAll())
                .statusCode(200)
                .message("data retreived successfully")
                .build();
    }

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody GroundPojo groundPojo) {
        this.groundService.saveData(groundPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }


//    @PostMapping("/save")
//    public void save(@RequestBody Ground ground) {
//
//        this.groundService.saveData(new GroundPojo());
//    }
//    @PostMapping
//    public ResponseEntity<Ground> createGround(@RequestBody GroundPojo groundPojo){
//        groundService.saveData(groundPojo);
//        return null;
//    }

    @GetMapping("/get/{id}")
    public Optional<Ground> getDataById(@PathVariable int id) {
        return groundService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {

        this.groundService.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody GroundPojo groundPojo) {
        this.groundService.saveData(groundPojo);
    }


}


