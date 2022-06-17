package com.inforpoint.designpattern.abstractfactory.landvehicle;

public class Motorcycle implements IVehicleLand, ILandVehicle {
    @Override
    public void startRouter() {
        System.out.println("---------- NineNine transportes terrestre é aerios ---------");
        System.out.println("Tipo do transporte: Motor");
        getCargo();
        startVehicleLand();
        System.out.println("Iniciando a entrega!");
        System.out.println("-------------------------------------------------------------");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando a encomenda!");
    }

    @Override
    public void startVehicleLand() {
        System.out.println("Ligado os motores!");
    }
}
