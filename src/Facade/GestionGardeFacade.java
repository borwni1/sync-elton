package Facade;

import Factory.ContratFactory;
import Model.Contrat;
import Service.SuiviService;
import Strategy.CalculIndemnite;
import Strategy.Calcul;

public class GestionGardeFacade {

    private SuiviService suivi = new SuiviService();
    private CalculIndemnite calcul = new Calcul();

    public Contrat creerContrat(String nom, String prenom) {
        return ContratFactory.creerContrat(nom, prenom);
    }

    public void ajouterGarde(Contrat c, int a, int d, boolean repas) {
    	//a et d correspondent aux heures d'arriver et de départ
        suivi.ajouterSession(c, a, d, repas);
    }

    public double calculerSalaire(Contrat c) {
        return calcul.calculer(c);
    }
}