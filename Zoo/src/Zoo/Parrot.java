package Zoo;

public class Parrot extends Animal implements Feedable {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "COCOO";
    }

    @Override
    public void eat(String food) {
        System.out.println("Parrot eats " + food);
    }
}
