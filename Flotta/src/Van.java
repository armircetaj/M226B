public class Van extends SuperVeicolo{
    public Van(String marca, String modello, Carburante carburante, String destinazione, double distanza) {
        super(marca, modello, carburante, destinazione, distanza);
    }
    @Override
    public double calcolaDestinazione(double distanza, Carburante tipo) {
        if (tipo == Carburante.GASOLINE) {
            return distanza / 1.2;
        } else if (tipo == Carburante.DIESEL) {
            return distanza / 2.1;
        }
        else {
            return 0;
        }
    }
}
