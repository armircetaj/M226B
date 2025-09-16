public class OnlineCourse {
    private String instructor;
    private Difficulty difficulty;
    private int estimatedHours;
    public boolean getCertificationEligible() {
        if (estimatedHours > 10) {
            return true;
        }
        else {
            return false;
        }
    }
}
