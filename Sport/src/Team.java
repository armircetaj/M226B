import java.util.Objects;

public class Team implements Comparable<Team> {
    private String name;
    private String school;
    private Sport sport;
    private int score;
    public Team(String name, String school, Sport sport, int score) {
        this.name = name;
        this.school = school;
        this.sport = sport;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public String getSchool() {
        return school;
    }
    public Sport getSport() {
        return sport;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public int compareTo(Team o) {
        return Integer.compare(score, o.score);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(school, team.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }

    @Override
    public String toString() {
        return this.name + " (Scuola " + this.school + ") - Sport: " + this.sport + " - Punti: " + this.score;
    }
}
