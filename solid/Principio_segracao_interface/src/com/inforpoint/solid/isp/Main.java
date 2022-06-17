package com.inforpoint.solid.isp;

import com.inforpoint.solid.isp.vehicles.Car;
import com.inforpoint.solid.isp.vehicles.Motorcycle;
import com.inforpoint.solid.isp.vehicles.TyperVehicle;

public class Main {
    private static TyperVehicle typerVehicle;
    public static void main(String[] args) {
	// write your code here
        typerVehicle = TyperVehicle.CAR;
        if(typerVehicle == TyperVehicle.CAR){
            Car car = new Car("Azul","2022", 2.0,4);
        }else if(typerVehicle == TyperVehicle.MOTORCYCLE){
            Motorcycle motorcycle = new Motorcycle("Amarela","2021",1000);
        }else {
            System.out.println("Opção inválida!");
        }
    }
}
