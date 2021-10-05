package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int tailleTableau;
        int[] tableau;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez donner une taille pour le tableau :");
        tailleTableau = scanner.nextInt();

        tableau = new int[tailleTableau];

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Veuillez saisir le nombre "+(i+1));
            tableau[i] = scanner.nextInt();
        }

        System.out.println("Resultat :");
        for (int j = 0; j < tableau.length; j++) {
            System.out.print(tableau[j]+" ");
        }
    }
}
