import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    private final OrderService service = new OrderService();

    @Test
    void orderIsNull() {
        assertEquals("UNKNOWN", service.getShippingCity(null));
    }

    @Test
    void customerIsNull() {
        Order order = new Order(null);
        assertEquals("UNKNOWN", service.getShippingCity(order));
    }

    @Test
    void addressIsNull() {
        Order order = new Order(new Customer(null));
        assertEquals("UNKNOWN", service.getShippingCity(order));
    }

    @Test
    void cityIsNull() {
        Order order = new Order(new Customer(new Address(null)));
        assertEquals("UNKNOWN", service.getShippingCity(order));
    }

    @Test
    void cityIsPresent() {
        Order order = new Order(new Customer(new Address("Roma")));
        assertEquals("Roma", service.getShippingCity(order));
    }
}
