package Zoo;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract String makeSound();

    @Override
    public String toString() {
        return name;
    }
}
