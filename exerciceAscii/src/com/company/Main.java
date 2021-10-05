package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int decimal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme de conversion unicode>>caractère ! (v1.0 05/10/21)");

        do {
            System.out.println("Veuillez saisir le code Unicode en décimal du caractère que vous souhaitez être affiché : (entre 0 et 65535");
            decimal = scanner.nextInt();
        } while (decimal < 0 && decimal > 65535);

        System.out.println((char)decimal);
    }
}
