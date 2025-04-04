package FormeGeometrique;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Carre carre = new Carre(5);

        System.out.println(carre);
        System.out.println("Coté: " + carre.getLongueur());
        carre.afficheSurface();
        System.out.println(rectangle);
        System.out.println("Longeur: " + rectangle.getLongueur());
        System.out.println("Largeur: "  + rectangle.getLargeur());
        rectangle.afficheSurface();
    }
}
