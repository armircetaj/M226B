public class Truck extends SuperVeicolo {
    public Truck(String marca, String modello, Carburante carburante, String destinazione, double distanza) {
        super(marca, modello, carburante, destinazione, distanza);
    }

    @Override
    public double calcolaDestinazione(double distanza, Carburante tipo) {
        if (tipo == Carburante.GASOLINE) {
            return distanza;
        } else if (tipo == Carburante.DIESEL) {
            return distanza / 2;
        }
        else {
            return 0;
        }
    }
}
