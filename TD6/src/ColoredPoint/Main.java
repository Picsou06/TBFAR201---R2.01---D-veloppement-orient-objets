package ColoredPoint;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ColoredPoint c = new ColoredPoint(1, 2, new Color(255, 255, 255));
        c.colore(Color.BLUE);
        System.out.println(c.getColor());
        System.out.println(c.memeCouleur(Color.black));
    }
}
