package Flotte;

import java.util.Arrays;
import java.util.Calendar;

public class Voiture extends Vehicule{
    private double cylindree;
    private int nbPortes;
    private double puissance;
    private double kilometrage;

    public Voiture(String marque, int dateAchat, double prixAchat, double cylindree, int nbPortes, double puissance, double kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void calculePrix() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int anneesEcoulees = year - super.getDateAchat();
        super.setPrixCourant(super.getPrixAchat() * Math.pow(0.98, anneesEcoulees) * Math.pow(0.95, (int) kilometrage/10000));
        if (Arrays.asList("Renault", "Fiat").contains(super.getMarque()))
            super.setPrixCourant(super.getPrixCourant() * 0.90);
        if (Arrays.asList("Ferrari", "Porsche").contains(super.getMarque()))
            super.setPrixCourant(super.getPrixCourant() * 1.20);
    }

    @Override
    public void affiche() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nCylindree: " + cylindree + "\nNombre de portes: " + nbPortes + "\nPuissance: " + puissance + "\nKilometrage: " + kilometrage;
    }

    public double getCylindree() {
        return cylindree;
    }

    public void setCylindree(double cylindree) {
        this.cylindree = cylindree;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }
}
