package ch.samt.talentshow;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;
import ch.samt.talentshow.model.Dancer;
import ch.samt.talentshow.model.Magician;
import ch.samt.talentshow.model.Partecipant;
import ch.samt.talentshow.model.Singer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Anna", 22, Category.SINGER, Level.PROFESSIONAL);
        Dancer dancer1 = new Dancer("Gianni", 19, Category.DANCER, Level.INTERMEDIATE);
        Magician magician1 = new Magician("Charlie", 25, Category.MAGICIAN, Level.BEGINNER);
        Singer singer2 = new Singer("Diana", 30, Category.SINGER, Level.INTERMEDIATE);
        Dancer dancer2 = new Dancer("Marco", 21, Category.DANCER, Level.PROFESSIONAL);
        List<Partecipant> partecipants = new ArrayList<Partecipant>();
        partecipants.add(singer1);
        partecipants.add(dancer1);
        partecipants.add(magician1);
        partecipants.add(singer2);
        partecipants.add(dancer2);

        for (Partecipant p : partecipants) {
            System.out.println(p.presentation());
            System.out.println(p.perform());
            System.out.println(p.getVote());
            System.out.println("------------------");
        }

        // Metodi Polimorfi: perform(), calculateVote()
        // Metodi Ereditati: presentation(), getVote(), getName(), getAge(), getCategory(), getLevel(),

    }
}
