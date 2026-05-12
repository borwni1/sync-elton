package Factory;

import model.Contrat;
import model.Enfant;

public class ContratFactory {

    public static Contrat creerContrat(String nom, String prenom) {
        Enfant enfant = new Enfant(nom, prenom);
        return new Contrat(enfant);
    }
}