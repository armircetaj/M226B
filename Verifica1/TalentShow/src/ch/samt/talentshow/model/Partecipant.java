package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;

public abstract class Partecipant {
    private String name;
    private int age;
    private Category category;
    private Level level;

    public Partecipant(String name, int age, Category category, Level level) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Category getCategory() {
        return category;
    }
    public Level getLevel() {
        return level;
    }
    public String presentation() {
        return name + " " + age + " anni, sale sul palco";
    }
    public String perform(){
        return name;
    }
    public String getVote() {
        return name + " (" + getCategory() + ", " + getLevel() + ")" + " -> Punteggio: " + calculateVote();
    }
    public double calculateVote() {
        double vote = 0.0;
        if (level == Level.BEGINNER) {
            vote += 3;
        }
        else if (level == Level.INTERMEDIATE) {
            vote += 4;
        }
        if (level == Level.PROFESSIONAL) {
            vote += 5;
        }
        return vote;
    }

}
