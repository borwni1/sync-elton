import Facade.GestionGardeFacade;
import Model.Contrat;
import Observer.NotificationMensuelle;

public class Main {
    public static void main(String[] args) {

        GestionGardeFacade facade = new GestionGardeFacade();

        Contrat contrat = facade.creerContrat("Marchand","Léon");

        facade.ajouterGarde(contrat, 8, 12, true);
        facade.ajouterGarde(contrat, 14, 18, false);

        double salaire = facade.calculerSalaire(contrat);

        System.out.println("Salaire total : " + salaire + "€");
        
        NotificationMensuelle notif = new NotificationMensuelle();

        notif.notifier("Récapitulatif du mois prêt");
        notif.notifier("Deuxième notification");
    }
}