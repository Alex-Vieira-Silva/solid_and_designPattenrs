package com.inforpoint.designpattern.bridger.platforms;

public class YuoTube implements IPlatforms{

    public YuoTube(){
        configureRTMP();
        System.out.println("YouTube: Transmissão iniciada!");
    }
    @Override
    public void configureRTMP() {
        authToken();
        System.out.println("Youtube: Configurando o broadcasting!");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando a aplicação!");
    }
}
