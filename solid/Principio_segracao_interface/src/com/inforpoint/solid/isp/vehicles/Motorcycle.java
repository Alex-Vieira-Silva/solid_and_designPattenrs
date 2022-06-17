package com.inforpoint.solid.isp.vehicles;

public class Motorcycle implements IVehicle, IVehicleMotorcycle{

    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine){
        configureMotorcycle(color, year, engine);
    }
    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores!");
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("Criando a motor: " + color + " " + year + " " +
                engine + " cilindradas");
        startVehicle();
    }
}
