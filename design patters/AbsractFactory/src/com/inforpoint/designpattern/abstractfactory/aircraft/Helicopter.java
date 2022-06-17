package com.inforpoint.designpattern.abstractfactory.aircraft;

public class Helicopter implements IAirVehicle, IAircraft{

    @Override
    public void startRouter() {
        System.out.println("Tipo do transporte: Helicóptero");
        wind();
        getCargo();
        startAirVehicle();
        System.out.println("Iniciando a decolagem!");
        System.out.println("----------------------------------------------------------");

    }

    @Override
    public void getCargo() {
        System.out.println("Passairos a bordo, decolagem autorizada!");
    }

    @Override
    public void startAirVehicle() {
        System.out.println("Ligando os motores, ativando as hélices!");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, suldeste, ventos ok!");
    }
}
