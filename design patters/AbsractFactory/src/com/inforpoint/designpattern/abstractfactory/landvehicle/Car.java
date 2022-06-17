package com.inforpoint.designpattern.abstractfactory.landvehicle;

public class Car implements IVehicleLand, ILandVehicle{
    @Override
    public void startRouter() {
        System.out.println("---------- Uber transportes terrestre é aerios ---------");
        System.out.println("Tipo do transporte: Carro");
        getCargo();
        startVehicleLand();
        System.out.println("Iniciando o trajeto!");
        System.out.println("--------------------------------------------------------");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando os passageiros, estamos prontos!");
    }

    @Override
    public void startVehicleLand() {
        System.out.println("Ligando os motores!");
    }
}
