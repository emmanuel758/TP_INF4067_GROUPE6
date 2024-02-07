package ABSTRACT_FACTORY;

public class Vehicule {
    protected String nom;
    protected String type;
    protected String couleur;
    protected String marque;
    protected String siege;
    protected double prix;

    public Vehicule(String nom, String type, String couleur, String marque, String siege, double prix) {
        this.nom = nom;
        this.type = type;
        this.couleur = couleur;
        this.marque = marque;
        this.siege = siege;
        this.prix = prix;
    }

    // Getters ----------------------

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMarque() {
        return marque;
    }

    public String getSiege() {
        return siege;
    }

    public double getprix() {
        return prix;
    }

    // Setters ----------------------

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}