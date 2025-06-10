package ex02;

/**
* Classe décrivant un enseignant qui est un autre cas particulier de personne
* enseignant une matière.
*/
public class Enseignant extends Personne
{
    String matiere;

	/**
	* Crée un enseignant ayant un numéro et une matière.
	*/
    public Enseignant(String nom, int age, String mat)
    {
        super(nom, age);
        this.matiere = mat;
    }

    /**
	* Retourne une description d'un enseignant incluant son nom et sa matère
	*/
    String getInfo()
    {
        return "Enseignant: " + getNom() + ", Matière: " + matiere;
    }
}

