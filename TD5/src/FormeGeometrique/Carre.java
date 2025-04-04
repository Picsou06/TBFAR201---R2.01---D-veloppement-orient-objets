package FormeGeometrique;

public class Carre extends Rectangle {

    public Carre(int x) {
        super(x, 0);
    }

    @Override
    public int getLargeur() {
        throw new UnsupportedOperationException("getLargeur is not supported for Carre");
    }

    @Override
    public double surface() {
        return super.getLongueur() * super.getLongueur();
    }

    @Override
    public String toString() {
        return "Carée: "+ this.getLongueur();
    }
}
