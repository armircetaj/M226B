public abstract class DigitalContent implements Purchasable {
    private int id;
    private String title;
    private String author;
    private double basePrice;
    private double currentDiscount;

    public DigitalContent(int id, String title, String author, double basePrice, double currentDiscount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
        this.currentDiscount = currentDiscount;
    }

    public void applyDiscount() {
        basePrice = basePrice * currentDiscount + basePrice;
    }
    public double calculatePrice() {
        return basePrice;
    }
    public abstract String getContentType();
    public abstract String getDescription();

}
