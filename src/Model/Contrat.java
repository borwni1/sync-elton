package model;

import java.util.ArrayList;
import java.util.List;

public class Contrat {
    
    private Enfant enfant;
    private List<SessionGarde> sessions = new ArrayList<>();
    private boolean estActif = true;

    public Contrat(Enfant enfant){
        this.enfant = enfant;
    }

    public void ajouterSession(SessionGarde session){
        sessions.add(session);
    }

    public List<SessionGarde> getSessions(){
        return sessions;
    }

    public Enfant getEnfant(){
        return enfant;
    }

    public List<Parent> getParent(){
        return enfant.getParents();
    }

    public boolean getEstActif(){
        return estActif;
    }
}
