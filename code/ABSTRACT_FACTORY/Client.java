public class Client {
    public static void main(String[] args) {
        // variables
        Automobile automobileElectrique = null;
        Automobile automobileEssence = null;
        Scooter scooterElectrique = null;
        Scooter scooterEssence = null;

        // fabriques
        IFabriqueVehicule fabriqueEssence = new FabriqueVehiculeEssence();
        IFabriqueVehicule fabriqueElectrique = new FabriqueVehiculeElectrique();

        System.out.println("Utilisation de la fabrique de vehicule essence ------------------------");

        // creation d'une automobile A essence
        automobileEssence = fabriqueEssence.creerAutomobile("Toyota 4010X", "Voiture", "Rouge", "Toyota", "Cuir",
                40000);

        // affichage
        automobileEssence.afficher();

        // creation scooter essence
        scooterEssence = fabriqueEssence.creerScooter("Scooter 40FCS", "Scooter a 3 roue", "Noir", "Konac", "Cuir",
                70000);

        // affichage
        scooterEssence.afficher();

        System.out.println("Utilisation de la fabrique de vehicule electrique ------------------------");

        // creation d'une automobile Electrique
        automobileElectrique = fabriqueElectrique.creerAutomobile("Bugatti Veron", null, "Voiture", "Bugatti", "Cuir",
                300000);

        // affichage
        automobileElectrique.afficher();

        // cretion d'un scooter electrique
        scooterElectrique = fabriqueElectrique.creerScooter("Scooter32ER", "Moto Gp", "Rouge", "Kinki", "Cuir", 40000);

        // affichage
        scooterElectrique.afficher();

    }
}
