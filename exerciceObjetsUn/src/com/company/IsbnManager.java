package com.company;

public class IsbnManager implements IsbnInterface{
    @Override
    public boolean check(String isbn) {
        char[] temp = isbn.toCharArray();
        int[] chiffres = new int[13];

        for (int i = 0; i < temp.length; i++) {
            chiffres[i] = Character.getNumericValue(temp[i]);
        }



        return false;
    }
}
