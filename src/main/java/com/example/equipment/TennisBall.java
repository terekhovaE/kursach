package com.example.equipment;

public class TennisBall extends Ball {

    public double levelElasticity;    //уровень упругости

    public  TennisBall(double levelElasticity, double weight, String manufacturer, double size, String material) {

        super(weight, manufacturer, size, material);
        this.levelElasticity = levelElasticity;
    }

    public TennisBall Update (Ball tennisBall) {

        super.Update(tennisBall);
        TennisBall t=(TennisBall) tennisBall;
        this.levelElasticity = t.levelElasticity;
        return this;
    }
}
