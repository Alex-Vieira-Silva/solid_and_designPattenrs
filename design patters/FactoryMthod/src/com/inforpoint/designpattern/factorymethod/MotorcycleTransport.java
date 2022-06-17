package com.inforpoint.designpattern.factorymethod;

import com.inforpoint.designpattern.factorymethod.vehicles.IVehicle;
import com.inforpoint.designpattern.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
