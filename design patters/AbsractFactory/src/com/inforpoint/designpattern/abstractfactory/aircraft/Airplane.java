package com.inforpoint.designpattern.abstractfactory.aircraft;

public class Airplane implements IAirVehicle, IAircraft{

    @Override
    public void startRouter() {
        System.out.println("Tipo do transporte: Avião");
        wind();
        getCargo();
        startAirVehicle();
        System.out.println("Iniciando o vôo!");
        System.out.println("----------------------------------------------------------");
    }

    @Override
    public void getCargo() {
        System.out.println("Passairos a bordo, vôo autorizado!");
    }

    @Override
    public void startAirVehicle() {
        System.out.println("Ligando os motores, ativado as turbinas!");
    }

    @Override
    public void wind() {
        System.out.println("Vetos a 25km, ventos ok!");
    }
}
