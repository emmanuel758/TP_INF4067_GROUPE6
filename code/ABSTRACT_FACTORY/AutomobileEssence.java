package ABSTRACT_FACTORY;

public class AutomobileEssence extends Automobile {

    public AutomobileEssence(String nom, String type, String couleur, String marque, String siege, double prix) {
        super(nom, type, couleur, marque, siege, prix);
    }

    public void afficher() {
        System.out.println("Je suis une automobile d'essence");
    }

}
