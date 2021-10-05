package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int totalSecondes, heures, minutes, secondes, reste;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme de conversion des secondes ! (v0.1 05/10/21)");

        do {
            System.out.println("Veuillez saisir le nombre de secondes à convertir : (entier positif)");
            totalSecondes = scanner.nextInt();
        } while (totalSecondes < 1);

        heures = totalSecondes/3600;
        reste = totalSecondes%3600;

        if (reste > 0) {
            minutes = reste/60;
            secondes = reste%60;
        } else {
            minutes = 0;
            secondes = 0;
        }

        System.out.println(totalSecondes+"s font "+heures+"h "+minutes+"m "+secondes+"s.");
    }
}
