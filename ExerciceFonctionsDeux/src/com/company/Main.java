package com.company;

public class Main {

    public static void main(String[] args) {
	    String chaineUne = new String("Est-ce que les Androïdes ");
        String chaineDeux = new String("rêvent de moutons electriques ?");

        System.out.println(concatenation(chaineUne, chaineDeux));
    }

    public static String concatenation(String str1, String str2) {
        return str1+str2;
    }
}
