import java.util.Comparator;

public class SportComparator implements Comparator<Team> {
    private String sport;

    @Override
    public int compare(Team o1, Team o2) {
        return o1.getSport().compareTo(o2.getSport());
    }
}

