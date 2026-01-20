import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AquaticCreatureTest {


    private static class TestCreature extends AquaticCreature {
        public TestCreature(String name, int energy, int speed, int age) {
            super(name, energy, speed, age);
        }

        @Override
        public String makeSound() {
            return "test-sound";
        }
    }

    @Test
    void testEatIncreasesEnergy() {
        AquaticCreature creature = new TestCreature("Nemo", 10, 5, 2);

        creature.eat();
        assertEquals(15, creature.getEnergy(), "Energy should increase by 5 after eating");
    }

    @Test
    void testMoveDecreasesEnergy() {
        AquaticCreature creature = new TestCreature("Nemo", 10, 5, 2);

        creature.move();
        assertEquals(8, creature.getEnergy(), "Energy should decrease by 2 after moving");
    }

    @Test
    void testMoveCausesDeathAtLowEnergy() {
        AquaticCreature creature = new TestCreature("Nemo", 1, 5, 2);

        creature.move();

        assertTrue(creature.getEnergy() <= 0);
        assertEquals("Nemo è morto", creature.die());
    }
}
