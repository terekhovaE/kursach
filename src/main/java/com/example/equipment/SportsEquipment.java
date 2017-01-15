package com.example.equipment;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public abstract class SportsEquipment {


  public   double weight;      //масса
  public   String manufacturer;    //производитель

    public SportsEquipment(double weight, String manufacturer) {
        this.weight = weight;
        this.manufacturer = manufacturer;

    }
    public SportsEquipment Update (SportsEquipment sport) {

        this.weight = sport.weight;;
        this.manufacturer = sport.manufacturer;;
        return  this;
    }



}

