package FlotteV2;

public abstract class AMoteur extends Vehicule {
    private double reservoir_capacity;
    private double reservoir_level;

    public AMoteur(double reservoir_capacity) {
        super();
        this.reservoir_capacity = reservoir_capacity;
        this.reservoir_level = 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", AMoteur{reservoir_capacity=" + reservoir_capacity + ", reservoir_level=" + reservoir_level + "}";
    }

    public void approvisionner (double nbLitres) {
        if (nbLitres < 0) {
            System.out.println("Erreur : la quantité de carburant à ajouter ne peut pas être négative.");
            return;
        }
        if (this.reservoir_level + nbLitres > this.reservoir_capacity) {
            System.out.println("Erreur : le réservoir déborde.");
            return;
        }
        this.reservoir_level += nbLitres;
    }

    public boolean enPanne() {
        return this.reservoir_level <= 0;
    }
}
