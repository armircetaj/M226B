public abstract class Predator extends AquaticCreature {
    private int ferocity;
    public abstract boolean hunt();
    public Predator(String name, int ferocity, int energy, int speed, int age) {
        super(name, energy, speed, age);
        this.ferocity = ferocity;
    }
    public int getFerocity() {
        return ferocity;
    }
}
