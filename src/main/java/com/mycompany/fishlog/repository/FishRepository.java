package com.mycompany.fishlog.repository;

import com.mycompany.fishlog.model.Fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository



public interface FishRepository extends JpaRepository<Fish, Integer> { //Integer is the model type for id
}
