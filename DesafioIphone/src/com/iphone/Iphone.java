package com.iphone;

import com.iphone.features.browser.ConcreteInternetBrowser;
import com.iphone.features.music.ConcreteMusicPlayer;
import com.iphone.features.phone.ConcretePhone;

public class Iphone {
    private final String serialNumber;
    private final String model;
    private final ConcreteMusicPlayer musicPlayer;
    private final ConcretePhone phone;
    private final ConcreteInternetBrowser browser;

    public Iphone(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.musicPlayer = new ConcreteMusicPlayer();
        this.phone = new ConcretePhone();
        this.browser = new ConcreteInternetBrowser();
    }

    public void turnOn(){
        System.out.println("Iphone is turning on.");
    }

    public void turnOff(){
        System.out.println("Iphone is turning off.");
    }

    public void openApp(String appName){
        System.out.println("Opening app: " + appName);
    }

    public void playMusic(){
        musicPlayer.play();
    }

    public void makeCall(String number){
        phone.makeCall(number);
    }

    public void browse(String url){
        browser.openURL(url);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }
}
