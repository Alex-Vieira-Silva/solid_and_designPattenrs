package com.inforpoint.designpattern.abstractfactory.factories;

import com.inforpoint.designpattern.abstractfactory.seavehicle.Boat;
import com.inforpoint.designpattern.abstractfactory.seavehicle.IBoat;

public class BoatTransport implements ITransportFactorySea {

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
