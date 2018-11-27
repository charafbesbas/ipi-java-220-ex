package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * Created by pjvilloud on 21/09/17.
 */
public abstract class Employe {

    //attributs
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate DateEmbauche;
    private Double salaire;


    //constructeurs
    public Employe() {}

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.DateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    //methodes fonctionnelles
    public final Integer getNombreAnneeAnciennete() {

        return LocalDate.now().getYear() - DateEmbauche.getYear();

    }

    public void augmenterSalaire(Double pourcentage){

        this.salaire = this.getSalaire() * (1 + pourcentage);
    }

    public abstract Double getPrimeAnnuelle();

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

    public void setDateEmbauche(LocalDate dateEmbauche) throws Exception {

        if(dateEmbauche != null && dateEmbauche.isAfter(LocalDate.now())) {

            throw new Exception("la date d'embauche ne peut être nulle ou postérieure à la date courante");

        }
        this.DateEmbauche = dateEmbauche;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }


    //redefinition des méthodes héritées
    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", DateEmbauche=" + DateEmbauche +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe employe = (Employe) o;
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, matricule, DateEmbauche, salaire);
    }

}