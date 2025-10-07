public class Dessert implements MenuItem {
    private String name;
    private double basePrice;
    private boolean hasExtraTopping;


    @Override
    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        if(hasExtraTopping) {
            return "Dessert " + name + " con topping extra";
        }
        else {
            return "Dessert " + name;
        }
    }

    @Override
    public int getPreparationTime() {
        return 5;
    }
}
