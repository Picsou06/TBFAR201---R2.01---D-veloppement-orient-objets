package Flotte;

public class Avion extends Vehicule{
    private String moteur;
    private int heuresVol;

    public Avion(String marque, int dateAchat, double prixAchat, String moteur, int heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.moteur = moteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void calculePrix() {
        super.calculePrix();
        if (moteur.equals("hélices"))
            super.setPrixCourant(super.getPrixCourant() * (1.0 - (int) heuresVol/100 * 0.1));
        else
            super.setPrixCourant(super.getPrixCourant() * (1.0 - (int) heuresVol/1000 * 0.1));
    }

    @Override
    public String toString() {
        return super.toString() + "\nMoteur: " + moteur + "\nHeures de vol: " + heuresVol;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public int getHeuresVol() {
        return heuresVol;
    }

    public void setHeuresVol(int heuresVol) {
        this.heuresVol = heuresVol;
    }
}
