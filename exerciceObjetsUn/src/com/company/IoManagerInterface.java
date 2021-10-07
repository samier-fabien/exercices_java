package com.company;

public interface IoManagerInterface {
    public String demanderTitre();
    public String demanderNom();
    public String demanderPrenom();
    public String demanderCategorie();
    public void afficher(String titre, String nom, String prenom, String categorie);
}
