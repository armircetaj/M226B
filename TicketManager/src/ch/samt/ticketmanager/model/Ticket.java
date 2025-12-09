package ch.samt.ticketmanager.model;

import ch.samt.ticketmanager.enumerator.Event;

public abstract class Ticket implements TicketStructure {
    private String ticketCode;
    private String eventName;
    private String date;
    private String place;
    private int seatNumber;
    private boolean sold;

    private Event eventType;

    public Ticket(String ticketCode, Event eventType, String eventName, String date, String place, int seatNumber) {
        this.ticketCode = ticketCode;
        this.eventName = eventName;
        this.date = date;
        this.place = place;
        this.seatNumber = seatNumber;
        this.eventType = eventType;
    }

    public double calculateTicketPrice() {
        return 0.0;
    }
    public void sellTicket() {
        sold = true;
    }
    public Event getEventType(){
        return eventType;
    }
    public String isSold(){
        if(sold){
            return "NON DISPONIBILE";
        }
        else{
            return "DISPONIBILE";
        }
    }
    public String getTicketCode() {
        return ticketCode;
    }
    public String getEventName() {
        return eventName;
    }
    public String getDate() {
        return date;
    }
    public String getPlace() {
        return place;
    }
    public int getSeatNumber() {
        return seatNumber;
    }


}
