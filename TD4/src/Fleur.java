public class Fleur {
    private String nom;
    private double prix;

    public Fleur(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return nom + " : " + prix + " euros";
    }
}
