package Flotte;

public class GestionVehicules {
	public static void main(String[] args) {
		Voiture[] garage = new Voiture[3];
		Avion[] hangar = new Avion[2];

		garage[0] = new Voiture("Peugeot", 2005, 13400.00, 1.4, 5, 4.0, 12000);
		garage[1] = new Voiture("Porsche", 2010, 160000.00, 3.6, 2, 25.0, 8320);
		garage[2] = new Voiture("Fiat", 1999, 8400.00, 1.2, 3, 5.0, 125000);

		for (int i = 0; i < garage.length; i++) {
			garage[i].calculePrix();
			garage[i].affiche();
		}


		hangar[0] = new Avion("Cessna", 1979, 204739.90, "HELICES", 250);
		hangar[1] = new Avion("Gulfstream", 1993, 4321098.00, "REACTION", 1300);

		for (int i = 0; i < hangar.length; i++) {
			hangar[i].calculePrix();
			hangar[i].affiche();
		}
	}
}