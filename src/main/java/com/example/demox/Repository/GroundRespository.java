package com.example.demox.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Ground ;


@Repository
public interface GroundRespository extends JpaRepository<Ground,Integer> {

}
