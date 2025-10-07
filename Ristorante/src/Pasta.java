public class Pasta implements MenuItem {
    private String name;
    private double price;
    private boolean isGlutenFree;

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String getDescription() {
        if (isGlutenFree) {
            return "Pasta " + name + " (senza glutine)";
        }
        else {
            return "Pasta " + name + " (con glutine)";
        }
    }

    @Override
    public int getPreparationTime() {
        return 12;
    }
}
