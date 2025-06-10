package ex02;
/**
 Exemple d'utilisation du polymorphisme
 */

/**
 * Classe abstraite représentant une personne en général.
 */
public abstract class Personne implements Comparable<Personne>
{
    private String nom;
    private int age;

    /**
     * Crée une personne
     */
    public Personne(String nom, int age)
    {
        this.nom = nom;
        this.age = age;
    }

    /**
     * Retourne le nom de la personne
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * Retourne l'âge de la personne
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Définit l'âge de la personne
     */
    public void setAge(int age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
    }

    /**
     * Retourne une chaîne donnant des informations sur la personne
     */
    abstract String getInfo();

    /**
     * Complare la l'instance courante avec une autre instance de la classe
     * Personne. Compraison basée sur l'ordre lexicographique des noms.
     */
    public int compareToWithName(Personne autre)
    {
        if (autre == null)
        {
            return 1;
        }
        return this.nom.compareTo(autre.nom);
    }

    /**
     * Complare la l'instance courante avec une autre instance de la classe
     * Personne. Compraison basée sur l'ordre des âges.
     */
    public int compareToWithAge(Personne autre)
    {
        if (autre == null)
        {
            return 1;
        }
        return Integer.compare(this.age, autre.age);
    }

    /**
     * Compare l'instance courante avec une autre instance de la classe Personne.
     * Utilise la méthode compareToWithAge pour la comparaison.
     */
    public int compareTo(Personne autre) {
        return this.compareToWithAge(autre);
    }

}

