package com.company;

import java.util.ArrayList;

public class Livre {
    final static String POLICIER = "policier";
    final static String ROMAN = "roman";
    final static String JUNIOR = "junior";
    final static String SF = "science-fiction";
    String titre, nom, prenom, categorie;
    int isbn;
    private ManagerInterface manager;

    public Livre(ManagerInterface manager) {
        this.manager = manager;
        this.titre = this.manager.demanderTitre();
        this.nom = this.manager.demanderNom();
        this.prenom = this.manager.demanderPrenom();
        this.categorie = this.manager.demanderCategorie();
        this.manager.afficher(titre, nom, prenom, categorie);
    }

    public ManagerInterface getManager() {
        return manager;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
