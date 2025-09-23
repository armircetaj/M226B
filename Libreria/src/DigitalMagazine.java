import java.time.LocalDate;

public class DigitalMagazine extends DigitalContent {
    private int issueNumber;
    private LocalDate publicationDate;
    private String category;
    public boolean isRecentIssue() {
        if(issueNumber == 3) return false;
        else return true;
    }

    public DigitalMagazine(int issueNumber, LocalDate publicationDate, String category, int id, String title, String author, double basePrice, double currentDiscount) {
        super(id, title, author, basePrice, currentDiscount);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.category = category;
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
