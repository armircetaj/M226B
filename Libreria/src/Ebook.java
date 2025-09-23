public class Ebook extends DigitalContent {
    private Genre genre;
    private int pageCount;
    private boolean isIllustrated;
    public int getReadingTime() {
        return 1;
    }

    public Ebook(Genre genre, int pageCount, boolean isIllustrated, int id, String title, String author, int basePrice, int currentDiscount) {
        super(id, title, author, basePrice, currentDiscount);
        this.genre = genre;
        this.pageCount = pageCount;
        this.isIllustrated = isIllustrated;
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
        return 0;
    }

    @Override
    public void applyDiscount(double percentage) {

    }
}
