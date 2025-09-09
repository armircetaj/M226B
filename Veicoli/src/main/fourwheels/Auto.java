package main.fourwheels;

import main.Veicolo;

import java.util.Objects;

public class Auto extends Veicolo {
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
