package com.inforpoint.designpattern.abstractfactory;

import com.inforpoint.designpattern.abstractfactory.app.Application;
import com.inforpoint.designpattern.abstractfactory.app.ApplicationSea;
import com.inforpoint.designpattern.abstractfactory.enumcompany.TypeCompany;
import com.inforpoint.designpattern.abstractfactory.factories.*;

public class Main {

    private static TypeCompany typeCompany;
    private static Enum typeEnum;
    public static void main(String[] args) {
	// write your code here
        typeCompany = TypeCompany.NineNine;

        if(typeCompany == TypeCompany.Boat){
            typeEnum = TypeCompany.Boat;
            ApplicationSea app = configureApplicationSea();
            app.startRouter();
        }else if(typeCompany == TypeCompany.Uber){
            typeEnum = TypeCompany.Uber;
            Application app = configureApplication();
            app.startRouter();
        }else if(typeCompany == TypeCompany.NineNine){
            typeEnum = TypeCompany.NineNine;
            Application app = configureApplication();
            app.startRouter();
        }else {
            System.out.println("Opção invalida, tente novamente!");
        }

    }

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory = null;

        if(typeCompany == TypeCompany.Uber){
            factory = new UberTransport();
        }else if(typeCompany == TypeCompany.NineNine){
            factory = new NineNineTransport();
        }else {
            System.out.println("Escolhar uma opção valida!");
        }

        app = new Application(factory);
        return app;
    }

    public static ApplicationSea configureApplicationSea(){
        ApplicationSea app;
        ITransportFactorySea factory = null;

        if(typeCompany == TypeCompany.Boat){
            factory = new BoatTransport();
        }else {
            System.out.println("Escolhar uma opção valida!");
        }

        app = new ApplicationSea(factory);
        return app;
    }
}
