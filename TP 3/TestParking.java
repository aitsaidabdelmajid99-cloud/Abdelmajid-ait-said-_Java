public class TestParking {
    public static void main(String[] args) {

        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("AA123", "Toyota", 4);
        v[1] = new Voiture("BB456", "BMW", 2);
        v[2] = new Moto("CC789", "Yamaha", true);
        v[3] = new Camion("DD000", "Volvo", 15000);

       
        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
            System.out.println("------------");
        }

       
        System.out.println("=== Voitures seulement ===");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        }

       
        Vehicule x = new Moto("11C22", "Yamaha", true);

      
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : impossible de caster Moto en Voiture !");
        }
        }
    
}