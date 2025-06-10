package FlotteV2;

public class Voiture extends AMoteur {
    private int nbPlace;

    public Voiture(double reservoir_capacity, int nbPlace) {
        super(reservoir_capacity);
        this.nbPlace = nbPlace;
    }

    @Override
    public String toString() {
        return super.toString() + ", Voiture{nbPlace=" + nbPlace + "}";
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public void transporter(Object... args) {
        int n = (int) args[0];
        int km = (int) args[1];
        if (this.enPanne())
            System.out.println("Erreur : la voiture n°" + this.getId() + " est en panne.");
        else
            System.out.println("La voiture n°" + this.getId() + " transporte " + n + " personnes sur " + km + " km");
    }
}
