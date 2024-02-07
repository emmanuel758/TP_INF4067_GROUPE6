package ABSTRACT_FACTORY;
public abstract class Automobile extends Vehicule {

    public Automobile(String nom, String type, String couleur, String marque, String siege, double prix) {
        super(nom, type, couleur, marque, siege, prix);
    }

    public abstract void afficher();

}
