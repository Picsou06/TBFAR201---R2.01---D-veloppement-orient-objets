package FlotteV2;

public class Camion extends AMoteur {
    private double volume;

    public Camion(double reservoir_capacity, double volume) {
        super(reservoir_capacity);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", Camion{volume=" + volume + "}";
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void transporter(String materiau, int km) {
        if (this.enPanne())
            System.out.println("Erreur : le camion n°" + this.getId() + " est en panne.");
        else
            System.out.println("Le camion n°" + this.getId() + " transporte " + materiau + " sur " + km + " km");
    }

    @Override
    public void transporter(Object... args) {
        String materiau = (String) args[0];
        int km = (int) args[1];
        if (this.enPanne())
            System.out.println("Erreur : le camion n°" + this.getId() + " est en panne.");
        else
            System.out.println("Le camion n°" + this.getId() + " transporte " + materiau + " sur " + km + " km");
    }
}
