package com.inforpoint.designpattern.builder.builders;

import com.inforpoint.designpattern.builder.cars.Truck;
import com.inforpoint.designpattern.builder.components.CarType;
import com.inforpoint.designpattern.builder.components.Engine;
import com.inforpoint.designpattern.builder.components.Transmission;

public class TruckBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private String color;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Truck getResult(){
        return new Truck(carType, seats, color, engine, transmission);
    }
}
