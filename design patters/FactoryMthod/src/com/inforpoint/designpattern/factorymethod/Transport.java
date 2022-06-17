package com.inforpoint.designpattern.factorymethod;

import com.inforpoint.designpattern.factorymethod.vehicles.IVehicle;

public abstract class Transport {
    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
