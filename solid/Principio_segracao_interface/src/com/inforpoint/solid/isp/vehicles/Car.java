package com.inforpoint.solid.isp.vehicles;

public class Car implements IVehicle, IVehicleCar{

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats){
        configureCar(color, year, engine, seats);
    }
    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores!");
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando o carro: " + color + " " + year + " " +
                engine + " com " + seats + " assentos");
        startVehicle();
    }

}
