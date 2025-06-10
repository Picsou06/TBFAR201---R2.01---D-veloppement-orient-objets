package ex02;

import java.util.ArrayList;
import java.util.Collections;

/**
* Exemple d'utilisation des classes précédentes
*/
public class Main
{
    public static void main(String[] args)
    {
        Etudiant bart = new Etudiant("Bart", 17, 17);
        Etudiant max = new Etudiant("Max",18, 43);
        Enseignant tom = new Enseignant("Tom",43, "Maths");

		//Crée une liste w contenant bart, max et tom
        ArrayList<Personne> w = new ArrayList<Personne>();
        w.add(tom);
        w.add(max);
        w.add(bart);

        
		//Affiche les informations associées à chaque personnes de la liste
        for(Personne p : w)
        {
            System.out.println(p.getInfo());
        }

		//Exemple de tri de la liste w
        Collections.sort(w, new java.util.Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return p1.compareToWithName(p2);
            }
        });

		//Affiche les informations associées à chaque personne après tri de la liste
        for(Personne p : w)
        {
            System.out.println(p.getInfo());
        }

        // Afficher les résultats de la méthode compareTo entre les 3 personnes.
        for(Personne p : w)
        {
            for(Personne q : w)
            {
                if (p != q)
                {
                    int result = p.compareToWithName(q);
                    System.out.println(p.getNom() + " compareTo " + q.getNom() + " = " + result);
                }
            }
        }
    }
}

// L'erreur est:
/*C:\Users\de402549\OneDrive - Université Côte d'Azur\Documents\TBFAR201 - R2.01 - Développement orienté objets\TD9\src\ex02\Main.java:31:20
java: no suitable method found for sort(java.util.ArrayList<ex02.Personne>)
method java.util.Collections.<T>sort(java.util.List<T>) is not applicable
      (inference variable T has incompatible bounds
equality constraints: ex02.Personne
upper bounds: java.lang.Comparable<? super T>)
method java.util.Collections.<T>sort(java.util.List<T>,java.util.Comparator<? super T>) is not applicable
      (cannot infer type-variable(s) T
        (actual and formal argument lists differ in length))

L'erreur se trouve dans la classe Personne
L'erreur est due au fait que la classe Personne n'implémente pas l'interface Comparable, alors qu'elle est demandé afin que `Collections.sort()` puisse trier les objets de type Personne.
La fonction n'est juste pas implémentée je ne vois pas comment me referencer a la documentation.
*/


