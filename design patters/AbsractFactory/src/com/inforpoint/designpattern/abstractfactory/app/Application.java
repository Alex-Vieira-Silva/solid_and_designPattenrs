package com.inforpoint.designpattern.abstractfactory.app;

import com.inforpoint.designpattern.abstractfactory.aircraft.IAircraft;
import com.inforpoint.designpattern.abstractfactory.factories.ITransportFactory;
import com.inforpoint.designpattern.abstractfactory.landvehicle.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();

    }

    public void startRouter(){
        vehicle.startRouter();
        aircraft.startRouter();
    }
}
