package com.example.equipment;

//Метательное копье
public class Javelin extends SportsEquipment {

    public double angleTip;    //угол острия
    public double length;    //длина


    public Javelin (double angleTip,  double length, double weight, String manufacturer) {

        super(weight, manufacturer);
        this.angleTip = angleTip;
        this.length = length;
    }

    public Javelin Update(SportsEquipment javelin) {

        super.Update(javelin);
        Javelin j=(Javelin) javelin;
        this.angleTip = j.angleTip;
        this.length = j.length;
        return this;
    }
}
