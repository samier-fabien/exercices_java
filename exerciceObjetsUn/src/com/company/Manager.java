package com.company;

import java.util.Scanner;

public class Manager implements ManagerInterface {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String demanderTitre() {
        String data = new String();

        System.out.println("Veuillez saisir le titre du livre :");
        data = scanner.next();

        return data;
    }

    @Override
    public String demanderNom() {
        String data = new String();

        System.out.println("Veuillez saisir le nom de l'auteur :");
        data = scanner.next();

        return data;
    }

    @Override
    public String demanderPrenom() {
        String data = new String();

        System.out.println("Veuillez saisir le prénom de l'auteur :");
        data = scanner.next();

        return data;
    }

    @Override
    public String demanderCategorie() {
        String data = new String();
        boolean test = true;

        do {
            System.out.println("Veuillez saisir la catégorie du livre : ("+Livre.POLICIER+"|"+Livre.JUNIOR+"|"+Livre.SF+"|"+Livre.ROMAN+")");
            data = scanner.next();
            switch (data) {
                case Livre.JUNIOR, Livre.POLICIER, Livre.SF, Livre.ROMAN: test = false;
                break;
            }
        } while (test);

        return data;
    }

    @Override
    public void afficher(String titre, String nom, String prenom, String categorie) {
        System.out.println("Titre : "+titre);
        System.out.println("Nom de l'auteur : "+nom);
        System.out.println("Prénom de l'auteur : "+prenom);
        System.out.println("Catégorie :"+categorie);
    }


}
