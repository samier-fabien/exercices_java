package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String mot = new String();
        int nombreDeVoyelles = 0;
        char caractere;
        char[] tableauVoyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue patati patata (v1.0 05/10/21)");

        System.out.println("Veuillez saisir une mot :");
        mot = scanner.next();

        for (int i = 0; i < mot.length(); i++) {
            caractere = mot.charAt(i);
            for (int j = 0; j < tableauVoyelles.length; j++) {
                if (caractere == tableauVoyelles[j]) {
                    nombreDeVoyelles++;
                }
            }
        }

        System.out.println("Nombre de voyelle : "+nombreDeVoyelles);
    }
}
