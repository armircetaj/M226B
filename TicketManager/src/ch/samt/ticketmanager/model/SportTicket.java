package ch.samt.ticketmanager.model;

import ch.samt.ticketmanager.enumerator.Event;

public class SportTicket extends Ticket {
    private String sector;

    public SportTicket(String ticketCode, Event eventType, String eventName, String date, String place, int seatNumber, String sector) {
        super(ticketCode, eventType, eventName, date, place, seatNumber);
        this.sector = sector;
    }
    public String getSector() {
        return sector;
    }

    @Override
    public double calculateTicketPrice() {
        if(sector.equals("TRIBUNA")) {
            return super.calculateTicketPrice() + 40.0;
        }
        else{
            return super.calculateTicketPrice() + 20.0;
        }
    }

    @Override
    public String toString() {
        return getEventType().toString() + " - " + getEventName() + " | Evento: " + getEventName() + " | Settore: " + getSector() + " | Posto: " + getSeatNumber() + " | Prezzo: " + calculateTicketPrice();
    }
}