public class Dessert implements MenuItem {
    private String name;
    private double basePrice;
    private boolean hasExtraTopping;

    public Dessert(String name, double basePrice, boolean hasExtraTopping) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasExtraTopping = hasExtraTopping;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isHasExtraTopping() {
        return hasExtraTopping;
    }

    @Override
    public double calculatePrice() {
        if (hasExtraTopping) {
            return basePrice + 1.5;
        }
        else {
            return basePrice;
        }
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
