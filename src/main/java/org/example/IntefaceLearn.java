package org.example;

public class IntefaceLearn {
    public static void main(String[] args) {
        Testando tttt = new Testando();
        tttt.sum(3,4);
    }
}

interface Calculadora{
    default void sum(int x, int y){
        System.out.println(x + y);
    };


}


class Testando implements Calculadora{



}

