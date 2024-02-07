package ABSTRACT_FACTORY;

public class ScooterEssence extends Scooter {

    public ScooterEssence(String nom, String type, String couleur, String marque, String siege, double prix) {
        super(nom, type, couleur, marque, siege, prix);
    }

    public void afficher() {
        System.out.println("Je suis un scooter a essence");
    }

}
