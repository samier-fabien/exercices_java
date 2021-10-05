package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int valeurUne, valeurDeux, echange;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme d'échange des valeurs ! (v1.0 04/10/21)");

        System.out.println("Donner la valeur 1 :");
        valeurUne = scanner.nextInt();

        System.out.println("Donner la valeur 2 :");
        valeurDeux = scanner.nextInt();

        System.out.println("Avant modification: valeur 1 = "+valeurUne+" et valeur 2 = "+valeurDeux);

        echange = valeurDeux;
        valeurDeux = valeurUne;
        valeurUne = echange;

        System.out.println("Après modification: valeur 1 = "+valeurUne+" et valeur 2 = "+valeurDeux);
    }
}
