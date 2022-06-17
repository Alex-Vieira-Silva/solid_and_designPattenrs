package com.inforpoint.designpattern.factorymethod;

import com.inforpoint.designpattern.factorymethod.vehicles.Car;
import com.inforpoint.designpattern.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
