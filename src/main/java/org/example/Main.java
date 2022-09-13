package org.example;

public class Main extends Thread {
    public static void main(String[] args) {
        CheckTemperature.run();
        CheckCrimes.run();
    }
}