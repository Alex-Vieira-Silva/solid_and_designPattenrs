package com.inforpoint.designpattern.abstractfactory.factories;

import com.inforpoint.designpattern.abstractfactory.aircraft.Helicopter;
import com.inforpoint.designpattern.abstractfactory.aircraft.IAircraft;
import com.inforpoint.designpattern.abstractfactory.landvehicle.ILandVehicle;
import com.inforpoint.designpattern.abstractfactory.landvehicle.Motorcycle;
import com.inforpoint.designpattern.abstractfactory.seavehicle.Boat;
import com.inforpoint.designpattern.abstractfactory.seavehicle.IBoat;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

}
