package segment;

import ex01.Point;

public class Segment {
	private Point origine;
	private Point extrémité;
	
	public Segment(Point or, Point Ex) {
		this.setOrigine(or);
		this.setExtrémité(Ex);
	}

	public Point getOrigine() {
		return origine;
	}

	public void setOrigine(Point origine) {
		this.origine = origine;
	}

	public Point getExtrémité() {
		return extrémité;
	}

	public void setExtrémité(Point extrémité) {
		this.extrémité = extrémité;
	}
	
	public double longueur() {
        double dx = extrémité.getX() - origine.getX();
        double dy = extrémité.getY() - origine.getY();
        return Math.sqrt(dx * dx + dy * dy);
	}

	public Segment projX() {
		Point projOrigine = origine.projX();
		Point projExtremite = extrémité.projX();
		return new Segment(projOrigine, projExtremite);
	}

	public Segment projY() {
		Point projOrigine = origine.projY();
		Point projExtremite = extrémité.projY();
		return new Segment(projOrigine, projExtremite);
	}

	public String toString() {
		return "["+ origine + ", " + extrémité + "]";
	}
}
