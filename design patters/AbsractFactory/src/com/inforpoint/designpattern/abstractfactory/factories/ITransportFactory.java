package com.inforpoint.designpattern.abstractfactory.factories;

import com.inforpoint.designpattern.abstractfactory.aircraft.IAircraft;
import com.inforpoint.designpattern.abstractfactory.landvehicle.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
