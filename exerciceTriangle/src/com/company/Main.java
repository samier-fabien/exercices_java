package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int nombreLignes, retrait, nombreEtoiles;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Nombre de lignes :");
            nombreLignes = scanner.nextInt();

        for (int i = 1; i < nombreLignes+1; i++) {
            retrait = nombreLignes-1*i;
            nombreEtoiles = 1+(i-1)*2;

            //affichage retrait
            for (int j = 1; j < retrait+1; j++) {
                System.out.print(" ");
            }

            //affichage etoiles
            for (int k = 1; k < nombreEtoiles+1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
