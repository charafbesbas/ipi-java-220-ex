package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {

    //attributs
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate DateEmbauche;
    private Double salaire;


    //getters / setteurs
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDate getDateEmbauche() {
        return DateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        DateEmbauche = dateEmbauche;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }


    //constructeurs
    public Employe() {}

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.DateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    //methodes
    protected getNombreAnneeAnciennete() {


    }
}