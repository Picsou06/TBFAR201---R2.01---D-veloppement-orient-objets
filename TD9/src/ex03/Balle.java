package ex03;
/**
 * @(#)Balle.java
 *
 *
 * @author
 * @version 1.00 2016/4/20
 */

import java.awt.Color;

public class Balle
{
	private Color couleur;
	private static int n = 1; // C'est un blasphème de commencer à 0 pour un ID Madame
	private int id;

    public Balle()
    {
		this.couleur = Color.BLACK;
    	this.id = n++;
    }

    public Balle(Color c)
    {
    	this.couleur = c;
    	this.id = n++;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Balle ")
                .append(id)
                .append("  de Couleur : ")
                .append(couleur.toString());
        return sb.toString();
    }
}