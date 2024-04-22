package com.example.demo.Service.Impl;

import com.example.demo.Entity.Ground;
import com.example.demo.Repository.GroundRepository;
import com.example.demo.Service.GroundService;
import com.example.demo.pojo.GroundPojo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Setter

@Service
@RequiredArgsConstructor
public class GroundServiceImpl implements GroundService {

    @Override
    public List<Ground> getAll(){
        return groundRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        groundRepository.deleteById(id);//delete from table where id is what
    }

    @Override
    public Optional<Ground> findById(Integer id) {
        return groundRepository.findById(id);
    }

    private final GroundRepository groundRepository;





    @Override

    public void saveData(GroundPojo groundPojo) {

        Ground ground  = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGroundName(groundPojo.getGroundName());

        groundRepository.save(ground);

    }

}

