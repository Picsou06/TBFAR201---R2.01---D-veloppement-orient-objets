package ColoredPoint;

import ex01.Point;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point[] guirlande = new Point[10];
        guirlande[0] = new Point(0,5);
        guirlande[1] = new Point(1,4);
        guirlande[2] = new Point(2,3);
        guirlande[3] = new Point(3,2);
        guirlande[4] = new Point(4,1);
        guirlande[5] = new ColoredPoint(1, 1, java.awt.Color.RED);
        guirlande[6] = new ColoredPoint(2, 2, java.awt.Color.BLUE);
        guirlande[7] = new ColoredPoint(3, 3, java.awt.Color.GREEN);
        guirlande[8] = new ColoredPoint(4, 4, Color.BLACK);
        guirlande[9] = new ColoredPoint(5, 5, Color.WHITE);
        for (int i = 0; i < guirlande.length; i++) {
            System.out.println(guirlande[i].getClass().getName());
        }
        System.out.println(guirlande[0].getDistance(guirlande[6]));
        System.out.println(guirlande[6].getDistance(guirlande[0]));
        System.out.println(guirlande[3].projX());
        System.out.println(guirlande[8].projY());
        System.out.println(guirlande[7].equals(guirlande[6]));
        System.out.println(((ColoredPoint) guirlande[6]).memeCouleur(Color.black));
        ((ColoredPoint) guirlande[6]).colore(Color.BLACK);
        System.out.println(guirlande[6]);
    }
}
