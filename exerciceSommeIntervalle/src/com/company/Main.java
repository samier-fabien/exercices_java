package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int nombreUn, nombreDeux, somme;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue patati patata... (v1.0 05/10/21)");

        do {
            System.out.println("Veuillez saisir le premier entier positif :");
            nombreUn = scanner.nextInt();
        } while (nombreUn < 0 || nombreUn > 10000);

        do {
            System.out.println("Veuillez saisir le deuxième entier positif :");
            nombreDeux = scanner.nextInt();
        } while (nombreDeux < 0 || nombreDeux > 10000);

        somme = nombreUn;
        System.out.println(nombreUn);
        for (int i = (nombreUn+1); i < (nombreDeux+1); i++) {
            somme += i;
        }

        System.out.println(somme);
    }
}
