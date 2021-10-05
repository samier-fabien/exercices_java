package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int nombre, somme = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue patati patata... (v1.0 05/10/21)");

        do {
            System.out.println("Veuillez saisir un entier positif :");
            nombre = scanner.nextInt();
        } while (nombre < 0 || nombre > 10000);

        for (int i = 0; i < (nombre+1); i++) {
            somme += i;
        }

        System.out.println(somme);
    }
}
