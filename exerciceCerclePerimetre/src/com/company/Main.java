package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double rayon, perimetre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme de calcul du périmètre d'un cercle ! (v1.0 04/10/21)");
        System.out.println("Veuillez donner le rayon en centimètres du cercle :");

        rayon = scanner.nextDouble();

        perimetre = 2* rayon * Math.PI;

        System.out.println("Le périmètre du cercle est égale à "+perimetre+" centimètres");
    }
}
