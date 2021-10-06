package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        boolean ajouter = true;
        boolean trouve = false;
        String reponse = new String();
        Scanner scanner = new Scanner(System.in);

        while (ajouter) {
            System.out.println("Veuillez saisir un prénom :");
            liste.add(scanner.next());
            ajouter = false;

            System.out.println("Ajouter un prénom ? (o/n)");
            reponse = scanner.next();
            if (reponse.equals("o")) {
                ajouter = true;
            } else {
                ajouter = false;
            }
        }

        do {
            System.out.println("Veuillez saisir un prénom de la liste :");
            reponse = scanner.next();

            for (int i = 0; i < liste.size(); i++) {
                if (liste.get(i).equals(reponse)) {
                    trouve = true;
                    System.out.println("Bravo !");
                }
            }
        } while (trouve = false);

        System.out.println("Liste des prénoms :");
        for (String prenom : liste) {
            System.out.print(prenom+" ");
        }
    }
}
