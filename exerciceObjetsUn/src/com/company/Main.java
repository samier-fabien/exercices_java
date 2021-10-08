package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        IoManager ioManager = new IoManager();
        IsbnManager isbnManager = new IsbnManager();
        Livre assassinRoyal = new Livre(ioManager, isbnManager);
        isbnManager.check("9782123456803");

        //String a = "12344";
        //int nb = Integer.parseInt(a);
        //int nb2 = Arrays.copyOf(a);
    }
}
