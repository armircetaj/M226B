import java.util.Comparator;

public class SchoolComparator implements Comparator<Team> {
    private String school;

    @Override
    public int compare(Team o1, Team o2) {
        return o1.getSchool().compareTo(o2.getSchool());
    }
}

