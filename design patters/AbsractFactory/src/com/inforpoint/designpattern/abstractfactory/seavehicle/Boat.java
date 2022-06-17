package com.inforpoint.designpattern.abstractfactory.seavehicle;

public class Boat implements IVehicleBoat, IBoat{
    @Override
    public void startRouter() {
        System.out.println("---------- Boat transportes maritímos ---------");
        System.out.println("Tipo do transporte: Barco");
        wind();
        getCargo();
        starVehicleBoat();
        System.out.println("Iniciando o percuso!");
        System.out.println("------------------------------------------------");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando os passageiros, estamos prontos para decer o rio!");
    }

    @Override
    public void starVehicleBoat() {
        System.out.println("Ligando os motores, Acionando as torbinas!");
    }

    @Override
    public void wind() {
        System.out.println("Ventos 55km, ventos ok!");
    }
}
