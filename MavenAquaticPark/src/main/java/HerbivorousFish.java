public class HerbivorousFish extends AquaticCreature {
    public HerbivorousFish(String name, int energy, int speed, int age) {
        super(name, energy, speed, age);
    }

    @Override
    public String makeSound() {
        return "Blurblurblurb";
    }
}
