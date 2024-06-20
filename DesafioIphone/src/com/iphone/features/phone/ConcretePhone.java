package com.iphone.features.phone;

public class ConcretePhone implements Phone {
    private String currentCall;

    @Override
    public void makeCall(String number){
        currentCall = number;
        System.out.println("Calling: " + currentCall);
    }

    @Override
    public void receiveCall(){
        System.out.println("Receiving a call.");
    }
}
