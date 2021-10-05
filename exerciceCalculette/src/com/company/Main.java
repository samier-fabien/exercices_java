package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double nombreUn, nombreDeux, resultat;
        String operateur = new String();
        final String PLUS = "+";
        final String MOINS = "-";
        final String FOIS = "*";
        final String DIVISE = "/";
        Scanner scanner = new Scanner(System.in);


        System.out.println("Veuillez saisir le nombre un :");
        nombreUn = scanner.nextDouble();

        System.out.println("Veuillez saisir le nombre deux :");
        nombreDeux = scanner.nextDouble();

        do {
            System.out.println("Veuillez saisir un opérateur parmi '+', '-', '*', '/' :");
            operateur = scanner.next();
        } while ((operateur == PLUS) || (operateur == MOINS) || (operateur == FOIS) || (operateur == DIVISE));

        switch (operateur) {
            case PLUS -> {
                resultat = nombreUn+nombreDeux;
                System.out.println(nombreUn+" "+operateur+" "+nombreDeux+" = "+resultat);
            }
            case MOINS -> {
                resultat = nombreUn-nombreDeux;
                System.out.println(nombreUn+" "+operateur+" "+nombreDeux+" = "+resultat);
            }
            case FOIS -> {
                resultat = nombreUn*nombreDeux;
                System.out.println(nombreUn+" "+operateur+" "+nombreDeux+" = "+resultat);
            }
            case DIVISE -> {
                if (nombreDeux != 0) {
                    resultat = nombreUn/nombreDeux;
                    System.out.println(nombreUn+" "+operateur+" "+nombreDeux+" = "+resultat);
                } else {
                    System.out.println("Division par 0 interdite.");
                }
            }
        }
    }
}
