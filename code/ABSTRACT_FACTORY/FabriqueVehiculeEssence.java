package ABSTRACT_FACTORY;

public class FabriqueVehiculeEssence implements IFabriqueVehicule {

    @Override
    public Automobile creerAutomobile(String nom, String type, String couleur, String marque, String siege,
            double prix) {
        return new AutomobileEssence(nom, type, couleur, marque, siege, prix);
    }

    @Override
    public Scooter creerScooter(String nom, String type, String couleur, String marque, String siege, double prix) {
        return new ScooterEssence(nom, type, couleur, marque, siege, prix);
    }

}
