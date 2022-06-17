package com.inforpoint.designpattern.builder.cars;

import com.inforpoint.designpattern.builder.components.CarType;
import com.inforpoint.designpattern.builder.components.Engine;
import com.inforpoint.designpattern.builder.components.Transmission;

public class Car {
    private final CarType carType;
    private int seats;
    private String color;
    private final Engine engine;
    private final Transmission transmission;

    public Car(CarType carType,
               int seats,
               String color,
               Engine engine,
               Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this. transmission = transmission;
    }

    public CarType getCarType(){
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor(){
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission(){
        return transmission;
    }
    public String resultCar(){
        String car = getCarType() + " " + getColor();
        car +=  " com " + getSeats() + " assentos";
        car +=  " com " + engine.getPower() + " cavalos de pontência";
        car += " Transmission " + getTransmission();
        return car;
    }
}
