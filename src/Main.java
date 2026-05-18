import Facade.GestionGardeFacade;
import Model.Contrat;
import Observer.NotificationMensuelle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final GestionGardeFacade facade = new GestionGardeFacade();
    private static final List<Contrat> contrats = new ArrayList<>();
    private static final NotificationMensuelle notification = new NotificationMensuelle();

    public static void main(String[] args) {
    	
    	System.out.println("");
    	System.out.println("");
    	
    	System.out.println(" ░▒▓███████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓████████▓▒░▒▓█▓▒░   ░▒▓████████▓▒░▒▓██████▓▒░░▒▓███████▓▒░  \r\n"
    			+ "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░  ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ \r\n"
    			+ "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░  ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ \r\n"
    			+ " ░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓██████▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░  ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ \r\n"
    			+ "       ░▒▓█▓▒░  ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░  ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ \r\n"
    			+ "       ░▒▓█▓▒░  ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░  ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░ \r\n"
    			+ "░▒▓███████▓▒░   ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░       ░▒▓████████▓▒░▒▓████████▓▒░▒▓█▓▒░   ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░ ");
    	
    	System.out.println("");
    	System.out.println("");

        int choix;

        do {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 0:
                    creerContrat();
                    break;

                case 1:
                    ajouterSession();
                    break;

                case 2:
                    afficherContrats();
                    break;

                case 3:
                    calculerSalaire();
                    break;

                case 4:
                    envoyerNotification();
                    break;

                case 5:
                    afficherStatistiques();
                    break;

                case 9:
                    System.out.println("Fermeture...");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 9);
    }

    private static void afficherMenu() {
        System.out.println("\n===== GESTION GARDE ENFANTS =====");
        System.out.println("0 - Créer un contrat");
        System.out.println("1 - Ajouter une session de garde");
        System.out.println("2 - Afficher les contrats");
        System.out.println("3 - Calculer salaire");
        System.out.println("4 - Envoyer notification");
        System.out.println("5 - Voir statistiques");
        System.out.println("9 - Quitter");
        System.out.print("Choix : ");
    }

    private static void creerContrat() {
        System.out.print("Nom de l'enfant : ");
        String nom = scanner.nextLine();
        
        System.out.print("Prénom de l'enfant : ");
        String prenom = scanner.nextLine();

        Contrat contrat = facade.creerContrat(nom, prenom);
        contrats.add(contrat);

        System.out.println("Contrat créé.");
    }

    private static void ajouterSession() {
        if (contrats.isEmpty()) {
            System.out.println("Aucun contrat.");
            return;
        }

        afficherContrats();

        System.out.print("Index contrat : ");
        int index = scanner.nextInt();

        System.out.print("Heure arrivée : ");
        int a = scanner.nextInt();

        System.out.print("Heure départ : ");
        int d = scanner.nextInt();

        System.out.print("Repas ? (true/false) : ");
        boolean repas = scanner.nextBoolean();

        facade.ajouterGarde(contrats.get(index), a, d, repas);

        System.out.println("Session ajoutée.");
    }

    private static void afficherContrats() {
        if (contrats.isEmpty()) {
            System.out.println("Aucun contrat.");
            return;
        }

        for (int i = 0; i < contrats.size(); i++) {
            System.out.println(i + " - " +
                    contrats.get(i).getEnfant().getNom());
        }
    }

    private static void calculerSalaire() {
        afficherContrats();

        System.out.print("Index contrat : ");
        int index = scanner.nextInt();

        double salaire =
                facade.calculerSalaire(contrats.get(index));

        System.out.println("Salaire : " + salaire + "€");
    }

    private static void envoyerNotification() {
        //scanner.nextLine();
        System.out.print("Message : ");
        String msg = scanner.nextLine();

        notification.notifier(msg);
    }

    private static void afficherStatistiques() {
        int total = contrats.size();

        System.out.println("Nombre total de contrats : " + total);
    }
}