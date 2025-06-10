package ex03;

import java.awt.*;

public class Boite {
    private static final int maxObject = 5;
    private Color couleur;
    private Objet objet;
    private Boite[] boites;
    private int nbBoites;

    public Boite(Color color) {
        couleur = color;
    }

    public Boite(Color color, Objet object) {
        couleur = color;
        objet = object;
    }

    public Boite(Color color, Boite boite) {
        couleur = color;
        boites = new Boite[1];
        boites[0] = boite;
        nbBoites = 1;
    }

    public Boite(Color color, Objet object, Boite boite) {
        couleur = color;
        objet = object;
        boites = new Boite[1];
        boites[0] = boite;
        nbBoites = 1;
    }

    public Objet getObjet() {
        return objet;
    }

    public Color getCouleur() {
        return couleur;
    }

    public Boolean contientObjet(Objet o) {
        return objet == o;
    }

    public boolean estVide() {
        return objet == null && nbBoites == 0;
    }

    public void ajouteBoite(Boite boite) {
        if (nbBoites < maxObject) {
            Boite[] newBoites = new Boite[nbBoites + 1];
            System.arraycopy(boites, 0, newBoites, 0, nbBoites);
            newBoites[nbBoites] = boite;
            boites = newBoites;
            nbBoites++;
        } else {
            System.out.println("La boite est pleine");
        }
    }
}
