package ABSTRACT_FACTORY;

public class AutomobileElectrique extends Automobile {

    public AutomobileElectrique(String nom, String type, String couleur, String marque, String siege, double prix) {
        super(nom, type, couleur, marque, siege, prix);
    }

    public void afficher() {
        System.out.println("Je suis une automobile electrique");
    }

}
