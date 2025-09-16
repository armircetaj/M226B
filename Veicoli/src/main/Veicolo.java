package main;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int numero;

    public Veicolo(String targa, String marca, String modello, int numero) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numero = numero;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void faiRumore() {
        System.out.println("Wruuuuum");
    }
}
