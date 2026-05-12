package model;

public class SessionGarde {
    
    private int heureArrivee;
    private int heureDepart;
    private boolean repas;

    public SessionGarde(int arrivee, int depart, boolean repas) {
        this.heureArrivee = arrivee;
        this.heureDepart = depart;
        this.repas = repas;
    }

    public int duree() {
        return heureDepart - heureArrivee;
    }

    public boolean Repas() {
        return repas;
    }
}
