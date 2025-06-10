package ex02;

/**
* Classe représentant un étudiant qui est un cas particulier de personne
* ayant un numéro d'étudiant.
*/
public class Etudiant extends Personne
{
    int numEtu;

	/**
	* Crée un étudiant ayant un nom et un numéro d'étudiant.
	*/
    public Etudiant(String nom, int age, int num)
    {
        super(nom, age);
        this.numEtu = num;
    }

    /**
	* Retourne une description d'un étudiant incluant son nom et son numéro
	* d'étudiant.
	*/
    String getInfo()
    {
        return "Etudiant: " + getNom() + ", Numéro: " + numEtu;
    }
}

