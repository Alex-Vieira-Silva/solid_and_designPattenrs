package com.inforpoint.solid;

import com.inforpoint.solid.enumvehicle.TyperVehicle;
import com.inforpoint.solid.vehicles.Car;
import com.inforpoint.solid.vehicles.Motorcycle;

public class Main {
    private static TyperVehicle typerVehicle;
    public static void main(String[] args) {
        typerVehicle = TyperVehicle.MOTOCYCLE;

        if(typerVehicle == TyperVehicle.CAR){
            Car car = new Car("Amerela", "2022", 2.0, 4);
        }else if(typerVehicle == TyperVehicle.MOTOCYCLE){
            Motorcycle motorcycle = new Motorcycle("Azul","2021", 250);
        }
    }
}
