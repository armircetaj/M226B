public class Pasta implements MenuItem {
    private String name;
    private double price;
    private boolean isGlutenFree;

    public Pasta(String name, double price, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    @Override
    public double calculatePrice() {
        if (isGlutenFree) {
            return price + 0.60;
        }
        else {
            return price;
        }
    }

    @Override
    public String getDescription() {
        if (isGlutenFree) {
            return "Pasta " + name + " (senza glutine)";
        }
        else {
            return "Pasta " + name;
        }
    }

    @Override
    public int getPreparationTime() {
        return 12;
    }
}
