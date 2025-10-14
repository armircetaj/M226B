import java.util.ArrayList;

public class Pizza implements MenuItem {
    private String name;
    private double basePrice;
    private ArrayList<String> toppings;

    public Pizza(String name, double basePrice, ArrayList<String> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }

    public String getTopping() {
        return String.join(", ", toppings);
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double calculatePrice() {
        return basePrice + toppings.size();
    }

    @Override
    public String getDescription() {
        return "Pizza " + name + " con: " + String.join(", ", toppings);
    }

    @Override
    public int getPreparationTime() {
        return 15 + toppings.size() * 2;
    }
}
