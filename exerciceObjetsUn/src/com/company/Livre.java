package com.company;

public class Livre {
    final static String POLICIER = "policier";
    final static String ROMAN = "roman";
    final static String JUNIOR = "junior";
    final static String SF = "science-fiction";
    String titre, nom, prenom, categorie;
    String isbn = "9782123456803";
    private IoManagerInterface ioManager;
    private IsbnInterface isbnManager;

    public Livre(IoManagerInterface ioManager, IsbnInterface isbnManager) {
        this.ioManager = ioManager;
        this.isbnManager = isbnManager;
        this.titre = this.ioManager.demanderTitre();
        this.nom = this.ioManager.demanderNom();
        this.prenom = this.ioManager.demanderPrenom();
        this.categorie = this.ioManager.demanderCategorie();
        this.ioManager.afficher(titre, nom, prenom, categorie);
    }

    public IoManagerInterface getManager() {
        return ioManager;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
