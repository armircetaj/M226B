import java.util.ArrayList;

public class Pizza implements MenuItem {
    private String name;
    private double basePrice;
    private ArrayList<String> toppings;




    @Override
    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return "Pizza " + name + " con: " + toppings;
    }

    @Override
    public int getPreparationTime() {
        return 15 + toppings.size() * 2;
    }
}
