package com.company;

public class Main {

    public static void main(String[] args) {
	    String phrase = new String("Combien de mots dans cette phrase ?");
        System.out.println(nbMots(phrase));
    }

    public static int nbMots(String str) {
        String[] nb = str.split(" ");
        return nb.length;
    }
}
