import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RestaurantManager {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<MenuItem> orderedItems;
    private ArrayList<Clienti> clients;
    private String stringone = "";
    private String stringone2 = "";
    private double doubleone;
    private double doubleone2;
    private Map<MenuItem, Integer> orders = new HashMap<>();

    public RestaurantManager(ArrayList<MenuItem> menuItems, ArrayList<Clienti> clients) {
        this.menuItems = menuItems;
        orderedItems = new ArrayList<>();
        this.clients = clients;
    }
    public String showMenu() {
        for(MenuItem menuItem : menuItems) {
            stringone2 += menuItem.getName().toUpperCase() + "\n" + menuItem.getDescription() + "\nPrezzo: $" + menuItem.calculatePrice() + "\nTempo di preparazione: " + menuItem.getPreparationTime() + " min\n\n";
        }
        return stringone2;
    }
    public String orderMenu(Clienti client, MenuItem order) {
        orderedItems.add(order);
        if(orders.containsKey(order)) {
            orders.put(order, orders.get(order) + 1);
        }
        else {
            orders.put(order, 1);
        }
        if(!(clients.contains(client))) {
            clients.add(client);
        }
        return "Ordine registrato: " + client.getName() + " - " + order.getName();
    }
    public double calculateAvg() {
        for (MenuItem order : orderedItems) {
            doubleone2 += order.calculatePrice();
        }
        return doubleone2 / orderedItems.size();
    }

    public String getFreq() {
        int max = 0;
        String item = "";
        for (Map.Entry<MenuItem, Integer> entry : orders.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                item = entry.getKey().getName();
            }
        }
        return item;
    }

    public String dailyStats(){
        for(Clienti client : clients) {
            stringone += " - " + client.getName() + "\n";
        }
        return "Clienti unici oggi: " + clients.size() + "\n\nClienti:\n" + stringone + "\nPiatto piu popolare: " + getFreq() + " (" + Collections.max(orders.values()) + " ordini)\n" + "Tempo medio di preparazione: " + calculateAvg() + " minuti";
    }
    public double calculateTotalPrice() {
        for(MenuItem order : orderedItems) {
            doubleone += order.calculatePrice();
        }
        return doubleone;
    }
}
