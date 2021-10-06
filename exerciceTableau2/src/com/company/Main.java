package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String[] tableau = {"Auriane", "Basptiste", "Caroline", "David", "Emile", "Fabien", "Gaspard", "Henri", "Igor", "Joséphine", "Kévin", "Laëtitia", "Marc", "Nicole", "Olivier", "Pélagie", "Quentin", "Richard", "Sabrina", "Thierry"};
        String nom = new String();
        Scanner scanner = new Scanner(System.in);
        boolean trouve = false;

        while (!trouve) {
            System.out.println("Veuillez indiquer un prénom s'il vous plait :");
            nom = scanner.next();

            for (int i = 0; i < tableau.length; i++) {
                if (nom.equals(tableau[i])) {
                    trouve = true;
                    for (int j = i; j < tableau.length; j++) {
                        if (j < (tableau.length-1)) {
                            tableau[j] = tableau[(j+1)];
                        } else {
                            tableau[j] = null;
                        }
                    }
                    //break;
                }
            }
        }

        System.out.println("Resultat du tableau :");
        for (int k = 0; k < tableau.length; k++) {
            System.out.print(tableau[k]+" ");
        }
    }
}
