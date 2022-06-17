package com.inforpoint.designpattern.bridger.transmissions;

import com.inforpoint.designpattern.bridger.platforms.IPlatforms;

public class Live implements ITransmission{

    protected IPlatforms platforms;

    public Live(){}

    public Live(IPlatforms platforms){
        this.platforms = platforms;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissão!");
    }

    @Override
    public void result() {
        System.out.println("***** NO AIR *****");
    }
}
