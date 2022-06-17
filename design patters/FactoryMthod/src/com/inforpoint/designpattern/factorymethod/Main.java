package com.inforpoint.designpattern.factorymethod;

public class Main {

    private static Transport transport;

    public static void main(String[] args) {
	// write your code here
        configure(args[0]);
        if(transport != null){
            runTransport();
        }
    }

    private static void runTransport(){
        transport.startTransport();
    }

    private static void configure(String type){
        switch(type){
            case "uber":
                transport = new CarTransport();
                break;
            case "logo":
                transport = new MotorcycleTransport();
        }
    }
}
