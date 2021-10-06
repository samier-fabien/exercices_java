package com.company;

public class Main {

    public static void main(String[] args) {
        fibonacci(0, 1);
    }

    public static void fibonacci(int premierNb, int deuxiemeNb) {
        int resultat = premierNb+deuxiemeNb;

        if (resultat<100) {
            System.out.println(resultat);
            fibonacci(deuxiemeNb, resultat);
        }

    }
}
