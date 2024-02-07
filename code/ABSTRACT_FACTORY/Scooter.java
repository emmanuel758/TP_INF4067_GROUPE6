package ABSTRACT_FACTORY;

public abstract class Scooter extends Vehicule {

    public Scooter(String nom, String type, String couleur, String marque, String siege, double prix) {
        super(nom, type, couleur, marque, siege, prix);
    }

    public abstract void afficher();

}
