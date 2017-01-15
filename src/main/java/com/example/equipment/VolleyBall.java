package com.example.equipment;

public class VolleyBall extends Ball {

    public String pump;    //тип насоса

    public VolleyBall(String pump, double weight, String manufacturer, double size, String material) {

        super(weight, manufacturer, size, material);
        this.pump = pump;
    }


    public VolleyBall Update(Ball volleyBall) {

        super.Update(volleyBall);
        VolleyBall v = (VolleyBall) volleyBall;
        this.pump = v.pump;
        return this;
    }
}
