public class Shark extends Predator {

    public Shark(String name, int energy, int speed, int ferocity, int age) {
        super(name, energy, speed, ferocity, age);
    }

    @Override
    public String makeSound() {
        return "Gnam-Gnam";
    }

    @Override
    public boolean hunt() {
        int randomNum = (int)(Math.random() * 2);
        if(getFerocity() > 65 && getEnergy() > 60 && getSpeed() > 20) {
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
