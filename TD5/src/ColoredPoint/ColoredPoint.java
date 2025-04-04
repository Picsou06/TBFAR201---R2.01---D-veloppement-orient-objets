package ColoredPoint;

import ex01.Point;

import java.awt.*;

public class ColoredPoint extends Point {
    private Color color;

    public ColoredPoint(double x, double y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ColoredPoint point = (ColoredPoint) obj;
        return memeCouleur(point.getColor()) && super.equals(point);
    }

    @Override
    public String toString() {
        return super.toString() + " " + color;
    }

    public void colore(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public boolean memeCouleur(Color c) {
        return color.equals(c);
    }

    public Point projX(Color color) {
        return new ColoredPoint(super.getX(), 0, color);
    }

    public Point projY(Color color) {
        return new ColoredPoint(super.getX(), 0, color);
    }

    public Point projX() {
        return new ColoredPoint(super.getX(), 0, this.color);
    }

    public Point projY() {
        return new ColoredPoint(0, super.getY(), this.color);
    }
}
