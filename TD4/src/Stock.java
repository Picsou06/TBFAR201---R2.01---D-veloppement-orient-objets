public class Stock {
    private Fleur rose;
    private Fleur tulipe;
    private Fleur oeillet;
    private int quantiteRose;
    private int quantiteTulipe;
    private int quantiteOeillet;

    public Stock(Fleur rose, Fleur tulipe, Fleur oeillet) {
        this.rose = rose;
        this.tulipe = tulipe;
        this.oeillet = oeillet;
    }

    public String toString() {
        return "Stock [" + quantiteRose + " roses, " + quantiteTulipe + " tulipes, " + quantiteOeillet + " oeillets]";
    }

    public void ajouteRose(int quantite) {
        quantiteRose += quantite;
    }

    public void ajouteTulipe(int quantite) {
        quantiteTulipe += quantite;
    }

    public void ajouteOeillet(int quantite) {
        quantiteOeillet += quantite;
    }

    public double valeurStock() {
        return rose.getPrix() * quantiteRose + tulipe.getPrix() * quantiteTulipe + oeillet.getPrix() * quantiteOeillet;
    }

    public boolean bouquetFaisable(Bouquet b) {
        return quantiteRose >= b.getLotRoses().getQuantite() && quantiteTulipe >= b.getLotTulipes().getQuantite() && quantiteOeillet >= b.getLotOeillets().getQuantite();
    }
}
