package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String phrase = new String(), lettre = new String();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir une phrase :");
        phrase = scanner.nextLine();

        System.out.println("Veuillez saisir une lettre :");
        lettre = scanner.next();

        System.out.println("Il y a "+nbLettres(phrase, lettre)+" occurence(s) de la lettre "+lettre);
    }

    public static int nbLettres(String phrase, String lettre) {
        int nb = 0;
        for (int i = 0; i <  phrase.length(); i++) {
            //phrase.substring(i, (i+1));
            if (lettre.equals(phrase.substring(i, (i+1)))) {
                nb++;
            }
        }
        return nb;
    }
}
