package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;

public class Singer extends Partecipant {
    private String name;
    private int age;
    private Category category;
    private Level level;

    public Singer(String name, int age, Category category, Level level) {
        super(name, age, category, level);
    }

    @Override
    public String perform(){
        return super.getName() + " canta 'O mia bela Madunina'.";
    }

    @Override
    public double calculateVote() {
        double vote = 4.5;
        if (super.getLevel() == Level.BEGINNER) {
            vote += 2.5;
        }
        else if (super.getLevel() == Level.INTERMEDIATE) {
            vote += 3.5;
        }
        if (super.getLevel() == Level.PROFESSIONAL) {
            vote += 5;
        }
        return vote;
    }
}