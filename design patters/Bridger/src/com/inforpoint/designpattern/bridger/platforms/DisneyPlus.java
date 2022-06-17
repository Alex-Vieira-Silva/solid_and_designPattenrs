package com.inforpoint.designpattern.bridger.platforms;

public class DisneyPlus implements IPlatforms{

    public DisneyPlus(){
        configureRTMP();
        System.out.println("DisneyPlus: Autorizando a aplicação!");
    }
    @Override
    public void configureRTMP() {
        authToken();
        System.out.println("DisneyPlus: Configurando o broadcasting!");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Transmissão iniciada!");
    }
}
