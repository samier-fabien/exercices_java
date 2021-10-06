package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int table, lettre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir la table de multiplication :");
        table = scanner.nextInt();

        tableMultiplications(table);
    }

    public static void tableMultiplications(int table) {
        for (int i = 1; i < 11; i++) {
            System.out.println(table+" x "+i+" = "+table*i);
        }
    }
}
