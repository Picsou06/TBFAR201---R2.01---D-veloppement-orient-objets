// TD9/src/ex03/Boite.java
package ex03;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Boite<T> {
    private static final int maxObject = 5;
    private Color couleur;
    private T objet;
    private List<Boite<T>> boites;

    public Boite(Color color) {
        couleur = color;
        boites = new ArrayList<>();
    }

    public Boite(Color color, T object) {
        couleur = color;
        objet = object;
        boites = new ArrayList<>();
    }

    public Boite(Color color, Boite boite) {
        couleur = color;
        boites = new ArrayList<>();
        boites.add(boite);
    }

    public Boite(Color color, T object, Boite boite) {
        couleur = color;
        objet = object;
        boites = new ArrayList<>();
        boites.add(boite);
    }

    public T getObjet() {
        return objet;
    }

    public Color getCouleur() {
        return couleur;
    }

    public Boolean contientObjet(T o) {
        return objet == o;
    }

    public boolean estVide() {
        return objet == null && boites.isEmpty();
    }

    public void ajouteBoite(Boite boite) {
        if (boites.size() < maxObject) {
            boites.add(boite);
        } else {
            throw new IllegalStateException("La boite est pleine");
        }
    }

    public void ajouteObjet(T o) {
        if (objet == null && boites.isEmpty()) {
            objet = o;
        } else {
            throw new IllegalStateException("La boite n'est pas vide");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Boite de couleur ").append(couleur).append(" contenant :\n");
        if (objet != null) {
            sb.append("Objet : ").append(objet.toString()).append("\n");
        } else {
            sb.append("Aucun objet\n");
        }
        if (!boites.isEmpty()) {
            sb.append("Contient les boites suivantes :\n");
            for (Boite<T> b : boites) {
                sb.append(b.toString()).append("\n");
            }
        } else {
            sb.append("Aucune boite contenue\n");
        }
        return sb.toString();
    }
}