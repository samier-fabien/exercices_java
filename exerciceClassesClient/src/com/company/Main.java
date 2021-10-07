package com.company;

public class Main {

    public static void main(String[] args) {
        Client paul = new Client("Paul", "Weller", "Baker street", "Londres");
        Client jack = new Client("Jack", "White", "On sait pas", "Detroit");

        System.out.println(paul);
        System.out.println(jack);
    }
}
