package org.example;

public class Main extends Thread {
    public static void main(String[] args) {
        //CheckTemperature.run();
        //CheckCrimes.run();
        //ArraysMethods.run();
        RaibowCheck newRainbow = new RaibowCheck();
        newRainbow.run();
    }
}