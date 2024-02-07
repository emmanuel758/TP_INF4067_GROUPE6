import java.util.*;
import ABSTRACT_FACTORY.*;
// import ADAPTER.*;
// import BRIDGE.*;
// import BUILDER.*;
// import COMPOSITE.*;
// import DECORATOR_OBSERVER.*;
// import FACTORY_METHOD.*;
// import ITERATOR.*;
// import SINGLETON.*;
// import TEMPLATE_METHOD.*;

public class Client {

    /**
     * Programme principal
     * 
     * @param args
     */
    public static void main(String[] args) {
        // variables ------------------------------------------------------------------

        // pour les inputs
        Scanner scanner = new Scanner(System.in);
        // liste des vehicules du systeme
        ArrayList<Vehicule> catalogue = new ArrayList<>();

        System.out.println("---------------- CATALOGUEDE VENTE DE VEHICULE ----------------\n");
        System.out.println("---------------- QUELQUES DONNEES DE TEST ----------------");
        // code pour ajouter les donnees de test ...

        int choix;
        do {
            System.out.println("\n---------------- APPLICATION ----------------\n");

            // Affichage du menu
            System.out.println("1. Ajouter des véhicules au catalogue");
            System.out.println("2. Rechercher un vehicule dans le catalogue");
            System.out.println("3. Afficher les vehicules");
            System.out.println("4. Passer une commande");
            System.out.println("5. Ajouter un client");
            System.out.println("6. Afficher les clients");
            System.out.println("7. Quitter\n");

            // saisie du choix
            System.out.print("Votre choix: ");

            // Vérification de la validité de la saisie
            while (!scanner.hasNextInt()) {
                System.out.println("Saisie invalide !");
                System.out.print("Votre choix: ");
                scanner.next(); // Consomme la mauvaise saisie
            }

            // Lecture du choix
            choix = scanner.nextInt();

            // Traitement du choix
            switch (choix) {
                case 1:
                    construireObject(catalogue);
                    // Traiter l'option 1
                    break;
                case 2:
                    System.out.println("Vous avez choisi l'option 2.");
                    // Traiter l'option 2
                    break;
                case 3:
                    System.out.println("Vous avez choisi l'option 3.");
                    // Traiter l'option 3
                    break;
                case 4:
                    System.out.println("Vous avez choisi l'option 4.");
                    // Traiter l'option 4
                    break;
                case 5:
                    System.out.println("Vous avez choisi l'option 5.");
                    // Traiter l'option 5
                    break;
                case 6:
                    System.out.println("Vous avez choisi l'option 6.");
                    // Traiter l'option 6
                    break;
                case 7:
                    // Sortie ...
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 7);

        scanner.close();

    }

    // --------------------- Méthodes de traitement des options --------------------

    /**
     * Construire les objets du domaine (automobile à
     * essence ou électrique, scooter à essence ou
     * électrique, etc.)
     * 
     * @param vehiculeList
     */
    public static void construireObject(ArrayList<Vehicule> vehiculeList) {
        // variables d'execution
        Scanner scanner = new Scanner(System.in);

        Automobile automobileElectrique = null;
        Scooter scooterElectrique = null;

        // fabriques
        IFabriqueVehicule fabriqueEssence = new FabriqueVehiculeEssence();
        IFabriqueVehicule fabriqueElectrique = new FabriqueVehiculeElectrique();

        System.out.println(
                "\n=================== Construction des objets du domaine (Patron Abstract Factory) ===================\n");

        int choix;
        do {

            // Affichage du menu
            System.out.println("Selectioonner la famille du véhicule à ajouter\n");
            System.out.println("1. Véhicule à éssence");
            System.out.println("2. Véhicule électrique");
            System.out.println("3. Quitter\n");

            // saisie du choix
            System.out.print("Votre choix: ");

            // Vérification de la validité de la saisie
            while (!scanner.hasNextInt()) {
                System.out.println("Saisie invalide !");
                System.out.print("Votre choix: ");
                scanner.next(); // Consomme la mauvaise saisie
            }

            // Lecture du choix
            choix = scanner.nextInt();

            // Traitement du choix
            switch (choix) {
                case 1:
                    System.out
                            .println("\n----------- Utilisation de la fabrique  de véhicules à essence -----------\n");
                    System.out.println("1. Automobile");
                    System.out.println("2. Scooter");

                    System.out.print("Votre choix: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Saisie invalide !\n");
                        scanner.next(); // Consomme la mauvaise saisie
                    } else {
                        int c = scanner.nextInt();

                        System.out.print("Nom: ");
                        String nom = scanner.next();

                        System.out.print("Type: ");
                        String type = scanner.next();

                        System.out.print("Couleur: ");
                        String couleur = scanner.next();

                        System.out.print("Marque: ");
                        String marque = scanner.next();

                        System.out.print("Siege: ");
                        String siege = scanner.next();

                        System.out.print("Prix: ");
                        double prix = scanner.nextDouble();
                        System.out.print("\n");

                        switch (c) {
                            case 1:
                                Automobile automobileEssence = fabriqueEssence.creerAutomobile(nom, type, couleur,
                                        marque, siege, prix);

                                vehiculeList.add(automobileEssence);

                                System.out.println("Automobile ajoutée au catalogue avec succès.\n");
                                break;

                            case 2:

                                Scooter scooterEssence = fabriqueEssence.creerScooter(nom, type, couleur,
                                        marque, siege, prix);

                                vehiculeList.add(scooterEssence);

                                System.out.println("Scooter ajoutée au catalogue avec succès.\n");
                                break;

                            default:
                                break;
                        }
                    }

                    break;
                case 2:
                    System.out
                            .println("\n----------- Utilisation de la fabrique  de véhicules electrique -----------\n");
                    System.out.println("1. Automobile");
                    System.out.println("2. Scooter");

                    System.out.print("Votre choix: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Saisie invalide !\n");
                        scanner.next(); // Consomme la mauvaise saisie
                    } else {
                        int c = scanner.nextInt();

                        System.out.print("Nom: ");
                        String nom = scanner.next();

                        System.out.print("Type: ");
                        String type = scanner.next();

                        System.out.print("Couleur: ");
                        String couleur = scanner.next();

                        System.out.print("Marque: ");
                        String marque = scanner.next();

                        System.out.print("Siege: ");
                        String siege = scanner.next();

                        System.out.print("Prix: ");
                        double prix = scanner.nextDouble();
                        System.out.print("\n");

                        switch (c) {
                            case 1:
                                Automobile automobileElectrique1 = fabriqueElectrique.creerAutomobile(nom, type,
                                        couleur,
                                        marque, siege, prix);

                                vehiculeList.add(automobileElectrique1);

                                System.out.println("Automobile ajoutée au catalogue avec succès.\n");
                                break;

                            case 2:
                                Scooter scooterElectrique1 = fabriqueElectrique.creerScooter(nom, type, couleur,
                                        marque, siege, prix);

                                vehiculeList.add(scooterElectrique1);

                                System.out.println("Scooter ajoutée au catalogue avec succès. \n");
                                break;

                            default:
                                break;
                        }
                    }

                    break;
                case 3:
                    // Sortie de la fonction
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

        } while (choix != 3);
    }
}
