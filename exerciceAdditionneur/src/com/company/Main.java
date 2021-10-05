package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double nb1, nb2, resultat;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le programme d'addition ! (v1.0 05/10/21)");

        System.out.println("Veuillez ecrire le premier nombre :");
        nb1 = scanner.nextDouble();

        System.out.println("Veuillez ecrire le deuxième nombre :");
        nb2 = scanner.nextDouble();

        resultat = nb1+nb2;
        System.out.println("La somme de "+nb1+" et de "+nb2+" est égale à "+resultat);
    }
}
