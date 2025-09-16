package Zoo;

public class Lion extends Mammal implements Feedable {
    public Lion(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public String makeSound() {
        return "ROAAAAAAAAAARRR";
    }


    @Override
    public void eat(String food) {
        System.out.println("Lion eats " + food);
    }
}
