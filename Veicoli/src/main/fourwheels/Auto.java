package main.fourwheels;

import main.Veicolo;
import main.interfaces.Riparabile;

import java.util.Objects;

public class Auto extends Veicolo implements Riparabile {
    private int porte;
    public Auto(String targa, String marca, String modello, int numero, int porte) {
        super(targa, marca, modello, numero);
        this.porte = porte;
    }
    public int getPorte() {
        return porte;
    }
    public void setPorte(int porte) {
        this.porte = porte;
    }
    public double calcolaCostoRiparabile(int oreLavoro) {
        return (oreLavoro * 45.0) + 100;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return porte == auto.porte;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(porte);
    }
}
