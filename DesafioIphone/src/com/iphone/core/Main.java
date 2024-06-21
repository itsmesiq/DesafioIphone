package com.iphone.core;

import com.iphone.Iphone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Iphone myIphone = new Iphone("123456","iPhone 13");
            myIphone.turnOn();

            boolean running = true;

            while(running){
                System.out.println("Hello, what would you like to do?");
                System.out.println("1 - Play Music");
                System.out.println("2 - Call");
                System.out.println("3 - Web Browser");
                System.out.println("4 - Turn off");
                String menuItem = scanner.nextLine();
                
                switch(menuItem) {
                    case "1" -> {
                        myIphone.playMusic();
                    }
                    case "2" -> {
                        System.out.println("Enter the phone number:");
                        String number = scanner.nextLine();
                        myIphone.makeCall(number);
                    }
                    case "3" -> {
                        myIphone.browse("http://www.google.com.br");
                    }
                    case "4" -> {
                        running = false;
                        myIphone.turnOff();
                    }
                    default -> {
                        System.out.println("Invalid option, please try again.");
                    }
                }

                if(running){
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                }
            }
        }
    }
}
