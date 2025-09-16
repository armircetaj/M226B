import main.fourwheels.Auto;
import main.fourwheels.Camion;
import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;
import main.service.AgenziaAssicurativa;
import main.service.Officina;
import main.twowheels.Moto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Auto miaAuto = new Auto("12121","Giovans","Giov",222,4);
        Moto miaMoto = new Moto("12121","Giovans","Giov",222,"Giovans");
        Camion mioCamion = new Camion(3);
        System.out.println(miaAuto.calcolaCostoRiparabile(10));
        System.out.println(miaMoto.getCostoAssicurazione());
        Assicurabile ass;
        Riparabile rip;
        List<Riparabile> veicoliInRiparazione = new ArrayList<>();
        veicoliInRiparazione.add(miaAuto);
        Set<Assicurabile> veicoliAssicurati = new HashSet<>();
        veicoliAssicurati.add(miaMoto);
        Officina miaOfficina = new Officina(veicoliInRiparazione);
        AgenziaAssicurativa miaAgenzia = new AgenziaAssicurativa(veicoliAssicurati);
        miaOfficina.stampaSchedarioRiparazioni();
        System.out.println(miaAgenzia.calcolaIncassoTotale());
    }
}