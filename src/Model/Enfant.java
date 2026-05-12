package model;

import java.util.ArrayList;
import java.util.List;

public class Enfant {

    private String nom;
    private String prenom;
    private List<Parent> parents = new ArrayList<>();

    public Enfant(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public List<Parent> getParents(){
        return parents;
    }
}
