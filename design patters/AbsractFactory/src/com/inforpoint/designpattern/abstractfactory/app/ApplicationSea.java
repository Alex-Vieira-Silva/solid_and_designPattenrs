package com.inforpoint.designpattern.abstractfactory.app;

import com.inforpoint.designpattern.abstractfactory.factories.ITransportFactory;
import com.inforpoint.designpattern.abstractfactory.factories.ITransportFactorySea;
import com.inforpoint.designpattern.abstractfactory.seavehicle.IBoat;

public class ApplicationSea {
    private IBoat boat;


    public ApplicationSea (ITransportFactorySea factory){
        boat = factory.createTransportBoat();
    }

    public void startRouter(){
        boat.startRouter();
    }
}
