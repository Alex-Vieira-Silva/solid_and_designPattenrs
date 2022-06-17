package com.inforpoint.designpattern.bridger.transmissions;

import com.inforpoint.designpattern.bridger.platforms.IPlatforms;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlatforms platforms){
        super.platforms = platforms;
    }

    public void subtitle(){
        System.out.println("Legendas ativadas na Transmissão!");
    }

    public void comments(){
        System.out.println("Cometarios liberados na Live!");
    }
}
