package com.company;

public class Client {
    private String nom, prenom, adresse, ville;

    public Client() {}
    public Client(String nom) {this.nom = nom;}
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public Client(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public Client(String nom, String prenom, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }

    public String toString() {
        return "nom : " + nom+
                "\nprenom : " + prenom+
                "\nadresse : " + adresse+
                "\nville : " + ville;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
