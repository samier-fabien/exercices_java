package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicules vehicules = new Vehicules();

        vehicules.add(new Voiture());
        vehicules.add(new Bateau());

        vehicules.afficher();
    }
}
