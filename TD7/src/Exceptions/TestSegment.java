package Exceptions;

import ex01.Point;
import segment.Segment;

public class TestSegment {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        try {
            Segment segment = new Segment(p1, p2);

            System.out.println("Origine: " + segment.getOrigine());
            System.out.println("Extrémité: " + segment.getExtrémité());
            System.out.println("Longueur: " + segment.longueur());
            System.out.println("Projection sur l'axe des abscisses: " + segment.projX());
            System.out.println("Projection sur l'axe des ordonnées: " + segment.projY());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
            throw e;
        }
    }
}
