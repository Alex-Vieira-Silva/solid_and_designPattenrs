package com.inforpoint.designpattern.abstractfactory.factories;

import com.inforpoint.designpattern.abstractfactory.aircraft.Airplane;
import com.inforpoint.designpattern.abstractfactory.aircraft.IAircraft;
import com.inforpoint.designpattern.abstractfactory.landvehicle.Car;
import com.inforpoint.designpattern.abstractfactory.landvehicle.ILandVehicle;
import com.inforpoint.designpattern.abstractfactory.seavehicle.Boat;
import com.inforpoint.designpattern.abstractfactory.seavehicle.IBoat;

public class UberTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

}
