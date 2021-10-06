package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] tableau = {8,2,7,1,3,5,6,4,9,0};
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
        for (int chiffre : tableau) {
            System.out.println(chiffre);
        }
    }
}
