package main.service;

import main.interfaces.Riparabile;
import java.util.List;
import java.util.ArrayList;

public class Officina {
    private List<Riparabile> veicoliInRiparazione = new ArrayList<>();
    public Officina(List<Riparabile> veicoliInRiparazione) {
        this.veicoliInRiparazione = veicoliInRiparazione;
    }
    public void accettaVeicolo(Riparabile veicolo) {
        veicoliInRiparazione.add(veicolo);
    }
    public void stampaSchedarioRiparazioni() {
        System.out.println("Riparazioni:");
    }


}
