package com.inforpoint.designpattern.bridger.platforms;

public class TwitchTV implements IPlatforms{

    public TwitchTV(){
        configureRTMP();
        System.out.println("TwitchTV: Transmissão iniciada!");
    }
    @Override
    public void configureRTMP() {
        authToken();
        System.out.println("TwitchTV: Configurando RMTP!");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o canal!");
    }
}
