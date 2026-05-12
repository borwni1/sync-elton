package model;

import java.util.ArrayList;
import java.util.List;

public class Parent {
    
    private String nom;
    private String prenom;
    private List<Contrat> contrats = new ArrayList<>();

    public Parent(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public void ajouterContrat(Contrat contrat){
        contrats.add(contrat);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Contrat> getContrats() {
        return contrats;
    }

}
