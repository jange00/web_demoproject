package com.example.demo.Controller;

import com.example.demo.Entity.Ground;
import com.example.demo.Service.GroundService;
import com.example.demo.pojo.GroundPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/ground")
@RequiredArgsConstructor
public class GroundController {
    private final GroundService groundService;

    @GetMapping("/get")
    public List<Ground> getData() {
        return this.groundService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody GroundPojo groundPojo) {

        this.groundService.saveData(groundPojo);
    }

    @GetMapping("/get/{id}")
    public Optional<Ground> getData(@PathVariable Integer id) {
       return groundService.findById(id);
    }
    @DeleteMapping("/delte/{id}")
    public void delete(@PathVariable Integer id) {
        this.groundService.deleteById(id);
    }
}
