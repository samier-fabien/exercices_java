package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double rayon, surface;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme de calcul de surface d'un cercle ! (v1.0 04/10/21)");
        System.out.println("Veuillez donner le rayon en centimètres du cercle :");

        rayon = scanner.nextDouble();

        surface = Math.pow(rayon, 2) * Math.PI;

        System.out.println("La surface du cercle est égale à "+surface+" centimètres carrés");
    }
}
