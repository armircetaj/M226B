import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TournamentManager tm = new TournamentManager();
        Set<Team> set = new HashSet();
        Team t1 = new Team("Lupi Verdi", "Alfa", Sport.Calcio, 12);
        Team t2 = new Team("Tigri Blu", "Beta", Sport.Pallavolo, 15);
        Team t3 = new Team("Falchi Rossi", "Alfa", Sport.Calcio, 12);
        Team t4 = new Team("Pantere Nere", "Gamma", Sport.Basket, 9);
        Team t5 = new Team("Lupi Verdi", "Alfa", Sport.Basket, 12);

        System.out.println("\n");
        set.add(t1);
        System.out.println(tm.addTeam(t1));
        set.add(t2);
        System.out.println(tm.addTeam(t2));
        set.add(t3);
        System.out.println(tm.addTeam(t3));
        set.add(t4);
        System.out.println(tm.addTeam(t4));
        set.add(t5);
        System.out.println(tm.addTeam(t5));
        System.out.println("\n*** Squadre in ordine naturale (punteggio decrescente) ***");
        System.out.println(tm.printTeamsSortedByNatural());
        System.out.println("\n*** Squadre in ordine per scuola ***");
        System.out.println(tm.printTeamsSortedBySchool());
        System.out.println("\n*** Squadre in ordine per sport ***");
        System.out.println(tm.printTeamsSortedBySport());
        System.out.println(tm.updateScore(t1.getName(), 3));
        System.out.println(tm.printScores());


    }
}
