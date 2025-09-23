import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", Carburante.GASOLINE, "Los Angeles", 1000);
        Van van1 = new Van("Mercedes", "Van", Carburante.DIESEL, "Vancouver", 1200);
        Truck truck1 = new Truck("Skoda", "M1", Carburante.DIESEL, "Moscow", 900);

        List<Veicolo> veicolos = new ArrayList<Veicolo>();
        veicolos.add(van1);
        veicolos.add(truck1);
        veicolos.add(car1);
        System.out.println();
        for (Veicolo veicolo : veicolos) {
            System.out.println(veicolo);
            veicolo.setStatus("in motion.");
            System.out.println(veicolo.stampaStatus());
            System.out.println("Fuel cost: " + veicolo.calcolaDestinazione(veicolo.getDistanza(), veicolo.getCarburante()));
            System.out.println("Arrived at destination. Total KM traveled: " + veicolo.getDistanza());
            veicolo.setStatus("stationery");
            System.out.println(veicolo.stampaStatus());
            System.out.println();
        }

    }
}