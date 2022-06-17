package com.inforpoint.designpattern.bridger;

import com.inforpoint.designpattern.bridger.platforms.*;
import com.inforpoint.designpattern.bridger.transmissions.AdvancedLive;
import com.inforpoint.designpattern.bridger.transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
	// write your code here
        startLive(new Facebook());
        startLive(new TwitchTV());
        startLive(new YuoTube());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatforms platforms){

        System.out.println("Transmissão avançada...aguarde!");
        AdvancedLive advancedLive = new AdvancedLive(platforms);
        RecordLive recordLive = new RecordLive();
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitle();
        recordLive.gravar();
        advancedLive.result();
    }
}
