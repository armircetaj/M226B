import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clienti client1 = new Clienti("Mario", "Rossi", 19);
        Clienti client2 = new Clienti("Luca", "Bianchi", 23);
        Clienti client3 = new Clienti("Anna", "Verdi", 34);
        Clienti client4 = new Clienti("Giovanni", "Neri", 27);
        Clienti client5 = new Clienti("Andrea", "Viola", 34);
        Clienti client6 = new Clienti("Sofia", "Arancio", 24);
        Clienti client7 = new Clienti("Matteo", "Verde", 29);
        ArrayList<String> margherita = new ArrayList<>();
        margherita.add("mozzarella");
        margherita.add("pomodoro");
        margherita.add("basilico");
        ArrayList<String> quattrostagioni = new ArrayList<>();
        quattrostagioni.add("mozzarella");
        quattrostagioni.add("prosciutto");
        quattrostagioni.add("funghi");
        quattrostagioni.add("carciofi");
        quattrostagioni.add("olive");
        Pizza pizza1 = new Pizza("Margherita", 7.5, margherita);
        Pizza pizza2 = new Pizza("Quattro Stagioni", 9.5, quattrostagioni);
        Dessert dessert1 =  new Dessert("Tiramisu", 5, false);
        Dessert dessert2 =  new Dessert("Panna Cotta", 5, true);
        Pasta pasta1 =  new Pasta("Arrabbiata", 9, true);
        Pasta pasta2 =  new Pasta("Carbonara", 9, false);

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(pizza1);
        menu.add(pizza2);
        menu.add(dessert1);
        menu.add(dessert2);
        menu.add(pasta1);
        menu.add(pasta2);
        ArrayList<Clienti> clienti = new ArrayList<>();
        clienti.add(client1);
        clienti.add(client2);
        clienti.add(client3);
        clienti.add(client4);
        clienti.add(client5);
        clienti.add(client6);
        RestaurantManager manage = new RestaurantManager(menu, clienti);

        System.out.println("============== MENU DEL RISTORANTE ==============\n");
        System.out.println(manage.showMenu());
        System.out.println("\n============== REGISTRAZIONE ORDINI ==============");
        System.out.println(manage.orderMenu(client1, pizza1));
        System.out.println(manage.orderMenu(client2, pasta2));
        System.out.println(manage.orderMenu(client3, pizza2));
        System.out.println(manage.orderMenu(client4, dessert1));
        System.out.println(manage.orderMenu(client5, pizza1));
        System.out.println(manage.orderMenu(client6, pasta2));
        System.out.println(manage.orderMenu(client7, pizza2));
        System.out.println(manage.orderMenu(client1, pasta2));
        System.out.println("\n============== STATISTICHE GIORNALIERE ==============");
        System.out.println(manage.dailyStats());
        System.out.println("=====================================================");
        System.out.println("\nFATTURATO TOTALE: $" + manage.calculateTotalPrice());
    }
}
