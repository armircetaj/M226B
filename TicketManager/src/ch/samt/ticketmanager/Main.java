package ch.samt.ticketmanager;

import ch.samt.ticketmanager.model.TicketManager;
import ch.samt.ticketmanager.model.ConcertTicket;
import ch.samt.ticketmanager.enumerator.Event;
import ch.samt.ticketmanager.model.SportTicket;
import ch.samt.ticketmanager.model.TheaterTicket;

public class Main {
    public static void main(String[] args) {
        TicketManager tm = new TicketManager();
        ConcertTicket t1 = new ConcertTicket("C001", Event.CONCERT, "Rock Festival 2025", "15/06/2025", "Parco eventi", 101, "The Rolling Stones", "TRIBUNA");
        ConcertTicket t2 = new ConcertTicket("C002", Event.CONCERT, "Rock Festival 2025", "18/06/2025", "Arena concerti", 201, "The Rolling Stones", "CURVA");
        ConcertTicket t3 = new ConcertTicket("C003", Event.CONCERT, "Jazz Night", "20/07/2025", "Arena concerti", 50, "The Rolling Stones", "TRIBUNA");
        TheaterTicket t4 = new TheaterTicket("T001", Event.THEATER, "Serate alla Scala", "10/08/2025", "Teatro alla Scala", 15, "La Traviata", 8, false);
        TheaterTicket t5 = new TheaterTicket("T002", Event.THEATER, "Serate alla Scala", "10/08/2025", "Teatro alla Scala", 25, "La Traviata", 3, true);
        TheaterTicket t6 = new TheaterTicket("T003", Event.THEATER, "Riscopriamo il teatro", "05/09/2025", "Teatro alla Scala", 4, "La Traviata", 12, false);
        TheaterTicket t7 = new TheaterTicket("T004", Event.THEATER, "Riscopriamo il teatro", "05/09/2025", "Teatro comunale", 41, "La Traviata", 12, true);
        SportTicket t8 = new SportTicket("S001", Event.SPORT, "Serie A - Inter vs Milan", "25/09/2025", "Stadio San Siro", 150, "TRIBUNA");
        SportTicket t9 = new SportTicket("S002", Event.SPORT, "Serie A - Inter vs Milan", "25/09/2025", "Stadio San Siro", 150, "CURVA");
        SportTicket t10 = new SportTicket("S003", Event.SPORT, "NBA Finals", "15/10/2025", "Madison Square Garden", 75, "TRIBUNA");
        System.out.println("\n\n\n=== SISTEMA DI GESTIONE BIGLIETTERIA ===\n\n");
        System.out.println("--- TEST 1: Aggiunta di 10 biglietti al sistema ---");
        System.out.println(tm.addTicket(t1));
        System.out.println(tm.addTicket(t2));
        System.out.println(tm.addTicket(t3));
        System.out.println(tm.addTicket(t4));
        System.out.println(tm.addTicket(t5));
        System.out.println(tm.addTicket(t6));
        System.out.println(tm.addTicket(t7));
        System.out.println(tm.addTicket(t8));
        System.out.println(tm.addTicket(t9));
        System.out.println(tm.addTicket(t10));
        System.out.println("\n--- TEST 2: Stampa di tutti i biglietti ---");
        System.out.println(tm.printTickets());
        System.out.println("--- TEST 3: Vendita di 5 biglietti ---");
        System.out.println(tm.sellTicket("Jazz Night"));
        System.out.println(tm.sellTicket("Serate alla Scala"));
        System.out.println(tm.sellTicket("Rock Festival 2025"));
        System.out.println(tm.sellTicket("Serie A - Inter vs Milan"));
        System.out.println(tm.sellTicket("NBA Finals"));
        System.out.println("\n--- TEST 4: NBA Finals - Biglietti terminati ---");
        System.out.println(tm.soldOutTicket(t10));
        System.out.println("\n--- TEST 5: Lista dei biglietti ancora disponibili ---");
        System.out.println(tm.getAvailableTickets());
        System.out.print("\n--- TEST 6: Calcolo incasso totale ---\nIncasso totale da biglietti venduti: ");
        System.out.println("€" + tm.getTotalRevenue());
        System.out.println("\n--- TEST 7: Biglietti per 'Rock Festival 2025' ---");
        System.out.println(tm.getSpecificTickets("Rock Festival 2025"));
        System.out.println("\n--- TEST 8: Biglietti ordinati per prezzo crescente ---");
        System.out.println(tm.getTicketsByPrice());
        System.out.println("\n--- TEST 9a: Tutti i biglietti per concerti ---");
        System.out.println(tm.getSpecificEventTickets(Event.CONCERT));
        System.out.println("\n--- TEST 9b: Tutti i biglietti sportivi ---");
        System.out.println(tm.getSpecificEventTickets(Event.SPORT));
        System.out.println("\n--- TEST 10: Prezzo medio di tutti i biglietti ---");
        System.out.println("€" + tm.getAveragePrice());



    }
}
// Metodi polimorfici: calculateTicketPrice(),
// Metodi ereditati: sellTicket(), getEventType(), isSold(), getTicketCode(), getEventName(), getDate(), getPlace(), getSeatNumber()