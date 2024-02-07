package ABSTRACT_FACTORY;

public class FabriqueVehiculeElectrique implements IFabriqueVehicule {

    @Override
    public Automobile creerAutomobile(String nom, String type, String couleur, String marque, String siege,
            double prix) {
        return new AutomobileElectrique(nom, type, couleur, marque, siege, prix);
    }

    @Override
    public Scooter creerScooter(String nom, String type, String couleur, String marque, String siege, double prix) {
        return new ScooterElectrique(nom, type, couleur, marque, siege, prix);
    }

}
