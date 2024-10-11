package com.mycompany.fishlog.model;


import jakarta.persistence.*;

@Entity
public class Fish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int id;
    private String fishSpecies;
    private Double fishWeight;
    private Double fishLength;




    public Fish(){

    }

    public Fish(String fishSpecies, double fishWeight, double fishLength) {
        this.fishSpecies = fishSpecies;
        this.fishWeight = fishWeight;
        this.fishLength = fishLength;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public double getFishWeight() {
        return fishWeight;
    }

    public double getFishLength() {
        return fishLength;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    public void setFishWeight(double weight) {
        this.fishWeight = weight;
    }

    public void setFishLength(double length) {
        this.fishLength = length;
    }

    @Override
    public String toString() {
        return "Fish" + fishSpecies + ", Weight:" + fishWeight + ", Length: " + fishLength;
    }

}
