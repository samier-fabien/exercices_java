package com.company;

import java.util.ArrayList;

public class Vehicules {
    ArrayList<Vehicule> conteneur = new ArrayList<Vehicule>();

    public void afficher() {
        for (int i = 0; i < conteneur.size(); i++) {
            conteneur.get(i).marche();
        }
    }

    public void add(Vehicule vehicule) {
        this.conteneur.add(vehicule);
    }

    public ArrayList<Vehicule> getConteneur() {
        return conteneur;
    }
}
