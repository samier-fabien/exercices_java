package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double nb1, nb2, resultat;
        Scanner scanner = new Scanner(System.in);

        System.out.println("bienvenue dans ce programme de division ! (v1.0 05/10/21)");

        System.out.println("veuillez rentrer le premier nombre :");
        nb1 = scanner.nextDouble();

        do {
            System.out.println("veuillez rentrer le diviseur, il doit être différent de 0 :");
            nb2 = scanner.nextDouble();
        } while (nb2 == 0);

        resultat = nb1/nb2;
        System.out.println("Le résultat est égal à "+resultat);
    }
}
