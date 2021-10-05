package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int anneeNaissance, age;
        final int anneeEnCours = 2021;
        final String majeur = new String("majeur");
        final String mineur = new String("mineur");
        final int majeurAge = 18;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue patati patata... (v1.0 05/10/21)");

        System.out.println("Veuillez saisir votre année de naissance");
        anneeNaissance = scanner.nextInt();

        age = anneeEnCours-anneeNaissance;

        if (age >= majeurAge) {
            System.out.println("Vous avez "+age+" ans, vous êtes "+majeur);
        } else {
            System.out.println("Vous avez " + age + " ans, vous êtes " + mineur);
        }
    }
}
