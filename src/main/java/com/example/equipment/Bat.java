package com.example.equipment;

//ракетка
public class Bat extends SportsEquipment{


    public  double sizeRim; //размер обода
    public double length;    //длина

    public Bat (double sizeRim, double length, double weight, String manufacturer) {

        super(weight, manufacturer);
        this.sizeRim = sizeRim;
        this.length = length;
    }

    public Bat Update(SportsEquipment bat) {

        super.Update(bat);
        Bat b=(Bat) bat;
        this.sizeRim = b.sizeRim;
        this.length = b.length;
        return this;
    }
}
