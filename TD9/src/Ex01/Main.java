package Ex01;

public class Main {

    public static void main(String[] args) {
        Parking parking = new Parking(10);

        Vehicule voiture1 = new Vehicule("Toyota", 2020, 20000);
        Vehicule moto1 = new Vehicule("Yamaha", 2019, 15000);

        System.out.println(parking);

        parking.garer(voiture1, 1);
        parking.garer(moto1, 2);

        System.out.println(parking);

        int placeVoiture1 = parking.chercher(voiture1);
        System.out.println("La voiture est garée à la place : " + placeVoiture1);

        parking.liberer(1);

        System.out.println(parking);
    }
}
