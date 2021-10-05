package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int nb;
        final String pair = new String("Nombre pair");
        final String impair = new String("Nombre impair");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue patati patata... (v1.0 05/10/21)");

        System.out.println("veuillez saisir un nombre entier :");
        nb = scanner.nextInt();

        if (nb%2 == 0) {
            System.out.println(pair);
        } else {
            System.out.println(impair);
        }
    }
}
