package ex01;

public class TestPoint {
	    public static void main(String[] args) {
	        Point p1 = new Point(3, 4);
	        Point p2 = new Point(6, 8);
	        Point p3 = new Point();
	        
	        System.out.println("Affichage des points :");
	        p1.afficher();
	        p2.afficher();
	        p3.afficher();
	        
	        System.out.println("Distance entre p1 et p2 : " + p1.getDistance(p2));
	        
	        System.out.println("Coordonnées initiales de p3 : " + p3);
	        p3.setX(10);
	        p3.setY(15);
	        System.out.println("Coordonnées modifiées de p3 : " + p3);
	        
	        System.out.println("Projection de p1 sur X : " + p1.projX());
	        System.out.println("Projection de p1 sur Y : " + p1.projY());
	        
	        System.out.println("Représentation de p1 en chaîne de caractères : " + p1);
	    }
}
