package com.iphone.features.browser;

public class ConcreteInternetBrowser implements InternetBrowser{
    private String currentURL;

    @Override
    public void openURL(String url){
        currentURL = url;
        System.out.println("Opening: " + currentURL);
    }

    @Override
    public void refresh(){
        System.out.println("Refreshing: " + currentURL);
    }

    @Override
    public void newPage(){
        System.out.println("Opening a new page.");
    }
}
