package Flotte;

import java.util.Calendar;

public class Vehicule {
    private String marque;
    private int dateAchat;
    private double prixAchat;
    private double prixCourant;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(int dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public double getPrixCourant() {
        return prixCourant;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
        if (this.prixCourant < 0)
            this.prixCourant = 0;
    }

    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public void calculePrix() {
        int year = Calendar.getInstance().get(Calendar. YEAR);
        int anneesEcoulees = year - dateAchat;
        prixCourant = prixAchat * Math.pow(0.99, anneesEcoulees);
    }

    public void affiche() {
        System.out.println("Marque: " + marque);
        System.out.println("DateAchat: " + dateAchat);
        System.out.println("PrixAchat: " + prixAchat);
        System.out.println("PrixCourant: " + prixCourant);
    }

    public String toString() {
        return "Marque: " + marque + "\nDate d'achat: " + dateAchat + "\nPrix d'achat: " + prixAchat + "\nPrix courant: " + prixCourant;
    }
}
