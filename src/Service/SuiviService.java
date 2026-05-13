package Service;

import Model.Contrat;
import Model.SessionGarde;

public class SuiviService {

    public void ajouterSession(Contrat contrat, int a, int d, boolean repas) {
    	// a et d correspondent à l'heure d'arrivée et de départ
        contrat.ajouterSession(new SessionGarde(a, d, repas));
    }
}