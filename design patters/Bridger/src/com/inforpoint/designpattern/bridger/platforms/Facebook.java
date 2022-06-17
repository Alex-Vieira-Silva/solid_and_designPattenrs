package com.inforpoint.designpattern.bridger.platforms;

public class Facebook implements IPlatforms {

    public Facebook(){
        configureRTMP();
        System.out.println("Facebook: Transmissão iniciada!");
    }
    @Override
    public void configureRTMP() {
        authToken();
        System.out.println("Facebook: Conta autorizada!");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook:Autorizado a aplicação!");
    }
}
