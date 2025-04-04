package Exceptions;

import ex01.Point;

public class Segment {
	private Point origine;
	private Point extrémité;
	
	public Segment(Point r, Point Ex) {
		if (r == null || Ex == null) {
			throw new IllegalArgumentException("Les points d'origine et d'extrémité ne peuvent pas être nuls.");
		}
		if (r.equals(Ex)) {
			throw new IllegalArgumentException("Les points d'origine et d'extrémité ne peuvent pas être confondus.");
		}
		this.setOrigine(r);
		this.setExtrémité(Ex);
	}

	public Point getOrigine() {
		return origine;
	}

	public void setOrigine(Point origine) {
		if (origine == null) {
			throw new IllegalArgumentException("Le point d'origine ne peut pas être nul.");
		}
		if (origine.equals(this.extrémité)) {
			throw new IllegalArgumentException("Le point d'origine ne peut pas être confondu avec le point d'extrémité.");
		}
		this.origine = origine;
	}

	public Point getExtrémité() {
		return extrémité;
	}

	public void setExtrémité(Point extrémité) {
		if (extrémité == null) {
			throw new IllegalArgumentException("Le point d'extrémité ne peut pas être nul.");
		}
		if (extrémité.equals(this.origine)) {
			throw new IllegalArgumentException("Le point d'extrémité ne peut pas être confondu avec le point d'origine.");
		}
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
