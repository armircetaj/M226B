package ch.samt.ticketmanager.model;

import ch.samt.ticketmanager.enumerator.Event;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TicketManager {
    private List<Ticket> tickets;
    private List<Ticket> availableTickets;
    private String stringone = "";
    private double doubleone = 0.0;
    private double avg;

    public TicketManager() {
        tickets = new ArrayList<Ticket>();
        availableTickets = new ArrayList<>();
    }
    public String addTicket(Ticket ticket) {
        tickets.add(ticket);
        availableTickets.add(ticket);
        return "Aggiunto biglietto con codice " + ticket.getTicketCode() + " per evento " + ticket.getEventName();
    }
    public String printTickets() {
        for (Ticket ticket : tickets) {
            stringone += "Codice: " + ticket.getTicketCode() + " | Evento: " + ticket.getEventName() + " | Data: " + ticket.getDate() + " | Luogo: " + ticket.getPlace() + " | Posto: " + ticket.getSeatNumber() + " | Prezzo: " + ticket.calculateTicketPrice() + " | Stato: " + ticket.isSold() + "\n";
        }
        return stringone;
    }
    public void updateTicketArray(Ticket ticket) {
        if (availableTickets.contains(ticket)) {
            availableTickets.remove(ticket);
            if(!(availableTickets.contains(ticket))) {
                soldOutTicket(ticket);
            }
        }
        else {
            soldOutTicket(ticket);
        }
    }
    public String sellTicket(String eventName) {
        for(Ticket ticket : this.tickets) {
            if(ticket.getEventName().equals(eventName)) {
                if (ticket.isSold().equals("DISPONIBILE")) {
                    ticket.sellTicket();
                    doubleone += ticket.calculateTicketPrice();
                    updateTicketArray(ticket);
                    return "Biglietto " + ticket.getTicketCode() + " per " + ticket.getEventName() + " venduto con successo!";

                } else {
                    return "Impossibile vendere biglietto " + ticket.getTicketCode() + ", biglietto già venduto";
                }
            }

        }
        return "Impossibile trovare un biglietto con evento " + eventName + "!";
    }
    public String soldOutTicket(Ticket ticket) {
        return "Sono terminati i biglietti per " + ticket.getEventName();
    }
    public String getAvailableTickets() {
        stringone = "Numero di biglietti disponibili: " + availableTickets.size() + "\n";
        for (Ticket ticket : availableTickets) {
            stringone += ticket.toString() + "\n";
        }
        return stringone;
    }
    public double getTotalRevenue() {
        return doubleone;
    }
    public String getSpecificTickets(String eventName) {
        stringone = "";
        for (Ticket ticket : tickets) {
            if(ticket.getEventName().equals(eventName)) {
                stringone += ticket.toString() + "\n";
            }
        }
        return stringone;
    }
    public String getTicketsByPrice() {
        stringone = "";
        tickets = tickets.stream()
                .sorted(Comparator.comparingDouble(Ticket::calculateTicketPrice))
                    .toList();
        for (Ticket ticket : tickets) {
            stringone += ticket.calculateTicketPrice() + " - " + ticket.toString() + "\n";
        }
        return stringone;
    }
    public String getSpecificEventTickets(Event eventType) {
        stringone = "";
        for (Ticket ticket : tickets) {
            if(ticket.getEventType().equals(eventType)) {
                stringone += ticket.toString() + "\n";
            }
        }
        return stringone;
    }
    public double getAveragePrice() {
        avg = tickets.stream()
                .mapToDouble(Ticket::calculateTicketPrice)
                .average()
                .orElse(0.0);
        return avg;
    }

}
