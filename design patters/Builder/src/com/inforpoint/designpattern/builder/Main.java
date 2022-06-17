package com.inforpoint.designpattern.builder;

import com.inforpoint.designpattern.builder.builders.CarBuilder;
import com.inforpoint.designpattern.builder.builders.TruckBuilder;
import com.inforpoint.designpattern.builder.cars.Car;
import com.inforpoint.designpattern.builder.cars.Truck;
import com.inforpoint.designpattern.builder.director.Director;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructCarSedan(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.resultCar() + " (produzido com sucesso!)");

        CarBuilder carBuilderSport = new CarBuilder();
        director.constructCarSprot(carBuilderSport);
        Car carSport = carBuilderSport.getResult();
        System.out.println(carSport.resultCar() + " (produzido com sucesso!)");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.printf("Caminhão" + truck.resultTruck() + " (produzido com sucesso!)");
    }
}
