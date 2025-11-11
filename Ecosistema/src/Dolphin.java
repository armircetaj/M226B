public class Dolphin extends Predator {
    private int intelligence;
    public Dolphin(String name, int intelligence, int ferocity, int energy, int speed, int age) {
        super(name, energy, speed, ferocity, age);
        this.intelligence = intelligence;
    }

    @Override
    public String makeSound() {
        return "Eee-eee-eee (click di delfino)";
    }

    @Override
    public boolean hunt() {
        int randomNum = (int)(Math.random() * 2);
        if(intelligence > 50 && getFerocity() > 65 && getEnergy() > 60 && getSpeed() > 20) {
            if(randomNum == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
