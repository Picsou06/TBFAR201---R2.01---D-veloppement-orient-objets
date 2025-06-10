package FlotteV2;

public class Velo extends SansMoteur{
    private int nbVitesse;

    public Velo(int nbVitesse) {
        super();
        this.nbVitesse = nbVitesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Velo{nbVitesse=" + nbVitesse + "}";
    }

    @Override
    public void transporter(Object... args) {
        String depart = (String) args[0];
        String arrivee = (String) args[1];
        System.out.println("Le vélo transporte de " + depart + " à " + arrivee);
    }
}
