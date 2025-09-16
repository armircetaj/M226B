public interface Purchasable {
    public double calculatePrice();
    public void applyDiscount(double percentage);
    public static double getDefaultTaxRate() {
        return 0.22;
    }
    public default double getPriceWithTax() {
        return calculatePrice() + getDefaultTaxRate();
    }

}
