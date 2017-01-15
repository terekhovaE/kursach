package com.example.equipment;



public class Weight extends Fitness {


    public double levelConvenience;    //степень удобства

    public Weight(double levelConvenience, String material, double weight, String manufacturer) {

        super(material, weight, manufacturer);
        this.levelConvenience = levelConvenience;
    }

    public Weight Update(SportsEquipment weight) {

        super.Update(weight);
        Weight w=(Weight) weight;
        this.levelConvenience = w.levelConvenience;
        return  this;
    }
}
