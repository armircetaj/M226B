import java.text.DateFormat;

public class AudioBook extends DigitalContent {
    private String narrator;
    private int duration;
    private String language;


    public AudioBook(String narrator, int duration, String language, int id, String title, String author, int basePrice, int currentDiscount) {
        super(id, title, author, basePrice, currentDiscount);
        this.narrator = narrator;
        this.duration = duration;
        this.language = language;
    }

    public DateFormat getFormattedDuration() {
        return DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
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
    public double calculatePrice() {
        double price = super.calculatePrice();
        if(duration > 8) {
            return price * 0.8;
        }
        else {
            return price;
        }
    }

    @Override
    public void applyDiscount(double percentage) {

    }
}
