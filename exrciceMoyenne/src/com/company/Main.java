package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double noteDs, noteInterro, noteTp, resultat;
        final int coeffDs = 3;
        final int coeffInterro = 2;
        final int coeffTp = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme de calcul de moyenne ! (v1.0 05/10/21)");

        do {
            System.out.println("Quelle est la note de votre D.S. ? (comprise entre 0 et 20)");
            noteDs = scanner.nextDouble();
        } while (noteDs >= 0 && noteDs >= 20);

        do {
            System.out.println("Quelle est la note de votre interrogation ? (comprise entre 0 et 20)");
            noteInterro = scanner.nextDouble();
        }  while (noteDs >= 0 && noteDs >= 20);

        do {
            System.out.println("Quelle est la note de votre T.P. ? (comprise entre 0 et 20)");
            noteTp = scanner.nextDouble();
        }  while (noteDs >= 0 && noteDs >= 20);

        resultat = (noteDs*coeffDs+noteInterro*coeffInterro+noteTp*coeffTp)/(coeffDs+coeffInterro+coeffTp);
        System.out.println("Votre moyenne est de "+resultat);
    }
}
