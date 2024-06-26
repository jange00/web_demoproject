package com.example.demo.Service;

import com.example.demo.Entity.Ground;
import com.example.demo.pojo.GroundPojo;

import java.util.List;
import java.util.Optional;

public interface GroundService {
    void saveData(GroundPojo groundPojo);

    List<Ground> getAll();

    void deleteById(Integer id);

    Optional<Ground> findById(Integer id);
}
