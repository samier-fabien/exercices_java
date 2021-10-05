package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double nb1, nb2, resultat;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme d'addtition ! (v1.0 04/10/21)");

        System.out.println("Veuillez donner le premier nombre :");
        nb1 = scanner.nextDouble();

        System.out.println("Veuillez donner le deuxième nombre :");
        nb2 = scanner.nextDouble();

        resultat = nb1 + nb2;

        System.out.println("Le résultat est de "+resultat);
    }
}
