package com.company;

public class Main {

    public static void main(String[] args) {
        IoManager ioManager = new IoManager();
        IsbnManager isbnManager = new IsbnManager();
        Livre assassinRoyal = new Livre(ioManager, isbnManager);
        isbnManager.check("9782123456803");
    }
}
