public class Jellyfish extends AquaticCreature {
    public Jellyfish(String name, int energy, int speed, int age) {
        super(name, energy, speed, age);
    }

    @Override
    public String makeSound() {
        return "Mewmewmewmewmemw";
    }
}
