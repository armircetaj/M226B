package Zoo;

import java.awt.print.Paper;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Re Leone", 100, true);
        Lion lion2 = new Lion("Nicolas", 16, true);
        Elephant elephant1 = new Elephant("Elefanz", 12, false);
        Elephant elephant2 = new Elephant("Pol", 19, false);
        Parrot parrot1 = new Parrot("Parr", 5);
        Parrot parrot2 = new Parrot("Ot", 2);
        List<Animal> animals = new ArrayList<>();
        animals.add(lion1);
        animals.add(lion2);
        animals.add(elephant1);
        animals.add(elephant2);
        animals.add(parrot1);
        animals.add(parrot2);
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.makeSound());
            if (animal instanceof Feedable) {
                if(animal instanceof Lion) {
                    ((Feedable) animal).eat("Meat");
                }
                if(animal instanceof Elephant) {
                    ((Feedable) animal).eat("Nuts");
                }
                if(animal instanceof Parrot) {
                    ((Feedable) animal).eat("Seeds");
                }

            }
        }

    }
}
