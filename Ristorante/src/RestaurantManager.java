import java.util.ArrayList;

public class RestaurantManager {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<MenuItem> orderedItems;
    private ArrayList<Clienti> clients;
    private String stringone;
    private double doubleone;
    public RestaurantManager() {
        menuItems = new ArrayList<>();
        orderedItems = new ArrayList<>();
        clients = new ArrayList<>();
    }
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    public String showMenu() {
        return menuItems.toString();
    }
    public String orderMenu(Clienti client, MenuItem order) {
        orderedItems.add(order);
        if(!(clients.contains(client))) {
            clients.add(client);
        }
        return "Ordine registrato: " + client + " - " + order;
    }
    public String dailyStats(){
        for(Clienti client : clients) {
            stringone += " - " + client.getName() + "\n";
        }
        return "Clienti unici oggi: " + clients.size() + "\n\nClienti:\n" + stringone + "Piatto piu popolare: ";
    }
    public double calculateTotalPrice() {
        for(MenuItem order : orderedItems) {
            doubleone += order.calculatePrice();
        }
        return doubleone;
    }
}
