package Exceptions;

public class Detect {
    private int[] tab;

    public Detect(int n) {
        tab = new int[n];
        for (int i = 0; i < n; i++)
            tab[i] = i + 1;
    }

    public int sommeDesNPremiers(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++)
            res += tab[i - 1];
        return res;
    }

    public static void main(String[] args) {
        float temp = Float.parseFloat(args[0]);
        int n = (int) temp;
        if (n < 0) {
            System.out.println("Erreur : le nombre doit etre positif");
            n = 0;
        }
        Detect d = new Detect(n);
        int r;
        r = d.sommeDesNPremiers(n);
        System.out.print("La somme des " + args[0] + " premiers nombres ");
        System.out.println("est : " + r);
    }


    // Si on rentre un nombre negatif, on a une ArrayIndexOutOfBoundsException
    // Si on rentre un nombre superieur a 99, on a une ArrayIndexOutOfBoundsException
    // Si on rentre un nombre non entier, on a une NumberFormatException
}
