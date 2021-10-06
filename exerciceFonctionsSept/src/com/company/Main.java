package com.company;

public class Main {

    public static void main(String[] args) {
	    String phrase = new String("une;petite;phrase;toute;conne"), delimiteur = new String(";");
        int motNumero = 3;

        System.out.println(strOk(phrase, delimiteur, motNumero));
    }

    public static String strOk(String str1, String str2, int n) {
        String[] mots = str1.split(str2);
        if (n <= mots.length && n >= 1) {
            return mots[n-1];
        } else {
            return "Pas de mot à l'emplacement "+n;
        }
    }
}
