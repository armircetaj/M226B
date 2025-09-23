public abstract class SuperVeicolo implements Veicolo {
    private String marca;
    private String modello;
    private Carburante carburante;
    private String destinazione;
    private double distanza;
    private String status;

    public SuperVeicolo(String marca, String modello, Carburante carburante, String destinazione, double distanza) {
        this.marca = marca;
        this.modello = modello;
        this.carburante = carburante;
        this.destinazione = destinazione;
        this.distanza = distanza;
    }


    public double calcolaDestinazione(double distanza, Carburante tipo) {
        if (tipo == Carburante.GASOLINE) {
            return distanza / 1.3;
        } else if (tipo == Carburante.DIESEL) {
            return distanza / 2.2;
        }
        else {
            return 0;
        }
    }

    public String stampaStatus() {
        return "Status: vehicle is " + status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Carburante getCarburante() {
        return carburante;
    }

    public double getDistanza() {
        return distanza;
    }

    @Override
    public String toString() {
        return marca + " " + modello + " has been assigned to destination:" + destinazione;
    }
}

