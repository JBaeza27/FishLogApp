package com.mycompany.fishlog.controller;

import com.mycompany.fishlog.model.Fish;
import com.mycompany.fishlog.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/fish")


public class FishController {

    @Autowired
    private FishService fishService;


    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestParam String fishSpecies, @RequestParam Double fishWeight, @RequestParam Double fishLength) {
        Fish fish = new Fish();
        fish.setFishSpecies(fishSpecies);
        fish.setFishLength(fishLength);
        fish.setFishWeight(fishWeight);

        fishService.saveFish(fish);
        return ResponseEntity.ok("New fish is added");
    }

    @GetMapping("/getAll")
    public List<Fish> getAllFish(){
        return fishService.getAllFish();
    }
}
