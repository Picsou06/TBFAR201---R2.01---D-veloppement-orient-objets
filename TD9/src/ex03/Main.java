package ex03;

public class Main {
    public static void main(String[] args) {
        Balle balleRouge = new Balle(java.awt.Color.RED);
        Boite<Balle> boiteBalle = new Boite<>(java.awt.Color.BLUE, balleRouge);

        Mail mail = new Mail("alice@example.com", "bob@example.com", "Bonjour Bob !");
        Boite<Mail> boiteMail = new Boite<>(java.awt.Color.GREEN, mail);

        Boite<Balle> boiteVide = new Boite<>(java.awt.Color.YELLOW);
        Boite<Balle> grandeBoite = new Boite<>(java.awt.Color.BLACK);
        grandeBoite.ajouteBoite(boiteBalle);
        grandeBoite.ajouteBoite(boiteVide);

        System.out.println("Contenu de boiteBalle : " + boiteBalle.getObjet());
        System.out.println("Contenu de boiteMail : " + boiteMail.getObjet());
        System.out.println("boiteVide est vide ? " + boiteVide.estVide());
        System.out.println("grandeBoite est vide ? " + grandeBoite.estVide());
    }
}