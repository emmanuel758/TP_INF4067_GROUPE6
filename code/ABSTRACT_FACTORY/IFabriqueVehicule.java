package ABSTRACT_FACTORY;

public interface IFabriqueVehicule {

    /**
     * Methode de creation d'une automobile
     * 
     * @return
     */
    public Automobile creerAutomobile(String nom, String type, String couleur, String marque, String siege,
            double prix);

    /**
     * Methode de creation d'un scooter
     * 
     * @return
     */
    public Scooter creerScooter(String nom, String type, String couleur, String marque, String siege, double prix);

}
