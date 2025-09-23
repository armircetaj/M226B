import java.util.Objects;

public class OnlineCourse extends DigitalContent{
    private String instructor;
    private Difficulty difficulty;
    private int estimatedHours;
    public OnlineCourse(String instructor, Difficulty difficulty, int estimatedHours, int id, String title, String author, double basePrice, double currentDiscount) {
        super(id, title, author, basePrice, currentDiscount);
        this.instructor = instructor;
        this.difficulty = difficulty;
        this.estimatedHours = estimatedHours;
    }
    public boolean getCertificationEligible() {
        if (estimatedHours > 10) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OnlineCourse that = (OnlineCourse) o;
        return estimatedHours == that.estimatedHours && Objects.equals(instructor, that.instructor) && difficulty == that.difficulty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructor, difficulty, estimatedHours);
    }

    @Override
    public String getContentType() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void applyDiscount(double percentage) {

    }
}

