package main.twowheels;

import main.Veicolo;

import java.util.Objects;

public class Moto extends Veicolo {
    private String tipo;
    public Moto(String targa, String marca, String modello, int numero, String tipo) {
        super(targa, marca, modello, numero);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(tipo, moto.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo);
    }
}
