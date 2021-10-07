package com.company;

public class IsbnManager implements IsbnInterface{
    @Override
    public boolean check(String isbn) {
        char[] temp = isbn.toCharArray();

        for (int i = 0; i < temp.length; i++) {
            int chiffre = Character.getNumericValue(temp[i]);
        }


        ////LA SUITE ICI
        return false;
    }
}
