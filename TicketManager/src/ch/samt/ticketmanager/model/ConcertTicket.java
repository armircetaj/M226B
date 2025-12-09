package ch.samt.ticketmanager.model;

import ch.samt.ticketmanager.enumerator.Event;

public class ConcertTicket extends Ticket {
    private String sector;
    private String mainArtist;

    public ConcertTicket(String ticketCode, Event eventType, String eventName, String date, String place, int seatNumber, String mainArtist, String sector) {
        super(ticketCode, eventType, eventName, date, place, seatNumber);
        this.mainArtist = mainArtist;
        this.sector = sector;
    }
    public String getSector() {
        return sector;
    }
    public String getMainArtist() {
        return mainArtist;
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
        return getEventType() + " - " + getEventName() + " | Artista: " + getMainArtist() + " | Settore: " + getSector() + " | Prezzo: " + calculateTicketPrice();
    }
}
