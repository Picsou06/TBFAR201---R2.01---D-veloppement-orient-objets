package FlotteV2;

public abstract class Vehicule {
    private static double compteurId = 1;
    private final double id;
    private double distance;

    public Vehicule() {
        this.id = compteurId++;
        this.distance = 0;
    }

    @Override
    public String toString() {
        return "Vehicule{id=" + id + ", distance=" + distance + "}";
    }

    public void rouler (double distance) {
        this.distance += distance;
    }

    public double getId() {
        return id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public abstract void transporter(Object... args);
}
