package com.iphone.core;

import com.iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone("123456","iPhone 13");
        myIphone.turnOn();
        myIphone.playMusic();
        myIphone.makeCall("2125250000");
        myIphone.browse("http://www.google.com.br");
        myIphone.turnOff();
    }
}
