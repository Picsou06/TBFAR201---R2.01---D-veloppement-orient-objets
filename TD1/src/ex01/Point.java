package ex01;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public Point getLocation() {
        return new Point(x, y);
    }

    public void setLocation(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getDistance(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    public void afficher() {
        System.out.println("[" + x + "," + y + "]");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point projX() {
        return new Point(x, 0);
    }

    public Point projY() {
        return new Point(0, y);
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return p.x == x && p.y == y;
        }
        return false;
    }
}
