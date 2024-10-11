package com.mycompany.fishlog.service;
import com.mycompany.fishlog.repository.FishRepository;
import com.mycompany.fishlog.model.Fish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {
    @Autowired
    private FishRepository fishRepository;

    public Fish saveFish(Fish fish){
        return fishRepository.save(fish);
    }

    public List<Fish> getAllFish(){
        return fishRepository.findAll();
    }
}
