package com.example.equipment;

public class Fitness extends SportsEquipment  {


    public String material;    //материал

    public Fitness(String material, double weight, String manufacturer) {

        super(weight, manufacturer);
        this.material = material;
    }
    public Fitness Update(SportsEquipment fitness) {

        super.Update(fitness);
        Fitness f=(Fitness) fitness;
        this.material = f.material;;
        return this;
    }
}
