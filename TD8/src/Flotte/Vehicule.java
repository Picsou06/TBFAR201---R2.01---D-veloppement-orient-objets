package Flotte;

import java.util.Calendar;

public abstract class Vehicule {
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

    public abstract void calculePrix();

    public void affiche() {
        System.out.println("Marque: " + marque);
        System.out.println("DateAchat: " + dateAchat);
        System.out.println("PrixAchat: " + prixAchat);
        System.out.println("PrixCourant: " + prixCourant);
    }

    public abstract String toString();
}
