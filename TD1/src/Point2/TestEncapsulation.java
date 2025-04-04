package Point2;

import ex01.Point;

public class TestEncapsulation {
    public static void main(String[] args) {
        Point p = new Point(3, 4);

        System.out.println("Coordonnée x : " + p.getX());
        System.out.println("Coordonnée y : " + p.getY());

        p.setX(10);
        p.setY(20);

        System.out.println("Nouvelles coordonnées : (" + p.getX() + ", " + p.getY() + ")");
    }
}
