package com.company;

import java.util.Scanner;

public class TriNombre {
    private int[] tableau;
    private int taille;

    public TriNombre() {
        this.saisie();
        this.tri(tableau);
        this.affiche();
    }

    public void saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez donner une taille pour le tableau :");
        taille = scanner.nextInt();

        tableau = new int[this.getTaille()];

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Veuillez saisir le nombre "+(i+1));
            tableau[i] = scanner.nextInt();
        }
    }

    public void tri(int[] tableau) {
        int echange;
        boolean changement = true;

        while (changement) {
            changement = false;
            for (int i = 0; i < tableau.length; i++) {
                if (i < (tableau.length-1)) {
                    if (tableau[i] > tableau[(i+1)]) {
                        echange = tableau[i];
                        tableau[i] = tableau[(i+1)];
                        tableau[i+1] = echange;
                        changement = true;
                    }
                }
            }
        }
    }

    public void affiche() {
        for (int chiffre : tableau) {
            System.out.println(chiffre);
        }
    }

    public int[] getTableau() {
        return tableau;
    }

    public void setTableau(int[] tableau) {
        this.tableau = tableau;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
