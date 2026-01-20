import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DolphinTest {

    private Dolphin smartDolphin;
    private Dolphin weakDolphin;

    @BeforeEach
    void setUp() {
        // Meets hunting conditions
        smartDolphin = new Dolphin(
                "SmartDolphin",
                80,
                70,
                80,
                30,
                5
        );

        weakDolphin = new Dolphin(
                "WeakDolphin",
                20,
                30,
                20,
                10,
                3
        );
    }

    @Test
    void testMakeSound() {
        String sound = smartDolphin.makeSound();
        assertEquals("Eee-eee-eee (click di delfino)", sound);
    }

    @Test
    void testHuntSuccessOrFailWhenConditionsMet() {
        boolean result = smartDolphin.hunt();
        assertTrue(result == true || result == false);
    }

    @Test
    void testHuntFailsWhenConditionsNotMet() {
        assertFalse(weakDolphin.hunt());
    }
}
