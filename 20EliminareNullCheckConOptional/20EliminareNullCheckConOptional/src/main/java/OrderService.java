import java.util.Optional;

public class OrderService {

    public String getShippingCity(Order order) {
        return Optional.ofNullable(order)
                .map(Order::getCustomer)
                .map(Customer::getAddress)
                .map(Address::getCity)
                .orElse("UNKNOWN");
    }
}
