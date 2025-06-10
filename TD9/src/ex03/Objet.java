package ex03;
import java.awt.*;

public class Objet {
	Color couleur;
	
	public Objet() {
		couleur = Color.white;
	}
	
	public Objet(Color c, String n) {
		couleur = c;
	}
	
	public void changeCouleur(Color c) {
		if (!couleur.equals(c))
			couleur = c;
		else
			System.out.println("L'objet est d�j� de couleur "+c);
	}
	
	public boolean equals(Object o) {
		Objet currentO = (Objet) o;
		return (currentO.couleur.equals(couleur));
	}
	
	public String toString() {
		return "Objet "+couleur;
	}

}
