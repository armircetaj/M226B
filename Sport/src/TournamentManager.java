import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TournamentManager {
    private List<Team> teams = new ArrayList<>();
    private String result = "";
    public String addTeam(Team t){
        teams.add(t);
        return "Team " + t.getName() + " aggiunto al tornero di " + t.getSport().toString();
    }
    public String updateScore(String teamName, int score){
        for(Team t : teams){
            if(t.getName().equals(teamName)){
                t.setScore(score + t.getScore());
            }
        }
        return "+ " + score + " punti a " + teamName + "!";
    }
    public String printTeamsSortedByNatural(){
        result = "";
        Collections.sort(teams);
        for(Team t : teams){
            result += t.toString() + "\n";
        }
        return result;
    }
    public String printTeamsSortedBySchool() {
        result = "";
        Collections.sort(teams, new SchoolComparator());
        for(Team t : teams){
            result += t.toString() + "\n";
        }
        return result;
    }
    public String printTeamsSortedBySport() {
        result = "";
        Collections.sort(teams, new SportComparator());
        for(Team t : teams){
            result += t.toString() + "\n";
        }
        return result;
    }
    public String printScores() {
        result = "(";
        for(Team t : teams){
            result += t.getName() + "=" + t.getScore() + ", ";
        }
        result += ")";
        return result;
    }
}
