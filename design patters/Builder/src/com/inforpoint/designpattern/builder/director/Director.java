package com.inforpoint.designpattern.builder.director;

import com.inforpoint.designpattern.builder.builders.IBuilder;
import com.inforpoint.designpattern.builder.components.CarType;
import com.inforpoint.designpattern.builder.components.Engine;
import com.inforpoint.designpattern.builder.components.Transmission;

import javax.swing.plaf.basic.BasicButtonUI;

public class Director {
    public void constructCarSedan(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setColor("Azul");
        builder.setEngine(new Engine(1600));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructCarSprot(IBuilder builder){
        builder.setCarType(CarType.PORSCHE);
        builder.setSeats(2);
        builder.setColor("Amerelo");
        builder.setEngine(new Engine(2600));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(3);
        builder.setColor("Vermelho");
        builder.setEngine(new Engine(13000));
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
    }
}
