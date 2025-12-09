public abstract class AquaticCreature {
    private int energy;
    private int speed;
    private String name;
    private int age;

    public AquaticCreature(String name, int energy, int speed, int age) {
        this.name = name;
        this.energy = energy;
        this.speed = speed;
        this.age = age;
    }

    public abstract String makeSound();

    public void move() {
        energy = energy - 2;
        if (energy <= 0) {
            die();
        }
    }
    public void eat() {
        energy = energy + 5;
    }

    public String die(){
        return name + " è morto";
    }

    public int getEnergy() {
        return energy;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
