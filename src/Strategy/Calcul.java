package Strategy;

import model.Contrat;
import model.SessionGarde;

public class Calcul implements CalculIndemnite{

    private static final double tarif_horaire = 15;

    @Override
    public double calculer(Contrat contrat) {
        double total = 0;

        for(SessionGarde s : contrat.getSessions()){
            total += s.duree() * tarif_horaire;
            if(s.Repas()){
                total+=3;
            }
        }

        return total;
    } 
}
