package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double farenheit, celcius, resultat;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans ce programme de conversion de température Faranheit>>Celcius ! (v1.0 05/10/21)");

        System.out.println("Veuillez saisir le température en °F :");
        farenheit = scanner.nextDouble();

        celcius = (farenheit-32)*5/9;
        System.out.println(farenheit+"°F = "+celcius+"°C");
    }
}
