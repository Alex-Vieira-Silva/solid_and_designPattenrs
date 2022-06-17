package com.inforpoint.designpattern.abstractfactory.factories;

import com.inforpoint.designpattern.abstractfactory.seavehicle.IBoat;

public interface ITransportFactorySea {
    IBoat createTransportBoat();
}
