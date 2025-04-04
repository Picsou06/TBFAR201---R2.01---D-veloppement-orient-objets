public class LotFleurs {
    private Fleur fleurs;
    private int quantité;

    public LotFleurs(Fleur fleurs, int quantité) {
        this.fleurs = fleurs;
        this.quantité = quantité;
    }

    public double getPrix() {
        return fleurs.getPrix() * quantité;
    }

    public double getQuantite() {
        return quantité;
    }
}