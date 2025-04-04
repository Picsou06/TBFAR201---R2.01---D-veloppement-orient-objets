package boite;

import java.awt.*;

public class Objet {
	Color couleur;
	private String nom;
	
	public Objet() {
		couleur = Color.white;
	}
	
	public Objet(Color c, String n) {
		couleur = c;
		nom = n;
	}
	
	public void changeCouleur(Color c) throws Exception{
		if (!couleur.equals(c))
			couleur = c;
		else
			throw new Exception("L'objet est déjà de couleur "+c);
	}
	
	public boolean equals(Object o) {
		Objet currentO = (Objet) o;
		return (currentO.couleur.equals(couleur));
	}

	@Override
	public String toString() {
		return "Objet [couleur=" + couleur + ", nom=" + nom + "]";
	}
	
	

}
