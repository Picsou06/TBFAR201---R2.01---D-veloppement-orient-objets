public class Bouquet {
    private LotFleurs lotroses;
    private LotFleurs lottulipes;
    private LotFleurs lotoeillets;

    public Bouquet(LotFleurs lotroses, LotFleurs lottulipes, LotFleurs lotoeillets) {
        this.lotroses = lotroses;
        this.lottulipes = lottulipes;
        this.lotoeillets = lotoeillets;
    }

    public double prix() {
        return lotroses.getPrix()*1.15 + lottulipes.getPrix()*1.15 + lotoeillets.getPrix()*1.15;
    }

    @Override
    public String toString() {
        return "Bouquet ["+ lotroses.getQuantite() + " roses, " +
                lottulipes.getQuantite() + " tulipes, " +
                lotoeillets.getQuantite() + " oeillets]";
    }

    public LotFleurs getLotRoses() {
        return lotroses;
    }

    public LotFleurs getLotTulipes() {
        return lottulipes;
    }

    public LotFleurs getLotOeillets() {
        return lotoeillets;
    }
}
