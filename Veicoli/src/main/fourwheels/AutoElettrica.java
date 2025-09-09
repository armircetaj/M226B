package main.fourwheels;

import main.Veicolo;
import main.interfaces.VeicoloElettrico;

public class AutoElettrica extends Auto implements VeicoloElettrico {
    private double autonomiaBatteria;
    public AutoElettrica(String targa, String marca, String modello, int numero, int porte, double autonomiaBatteria) {
        super(targa, marca, modello, numero, porte);
        this.autonomiaBatteria = autonomiaBatteria;
    }

    public double getAutonomiaBatteria() {
        return autonomiaBatteria;
    }
    public void ricarica() {
        autonomiaBatteria = 100;
    }
    public void setAutonomiaBatteria(double autonomiaBatteria) {
        this.autonomiaBatteria = autonomiaBatteria;
    }
}
