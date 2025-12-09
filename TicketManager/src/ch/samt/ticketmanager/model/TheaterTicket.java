package ch.samt.ticketmanager.model;

import ch.samt.ticketmanager.enumerator.Event;

public class TheaterTicket extends Ticket {
    private String showTitle;
    private int row;
    private boolean studentDiscount;
    public TheaterTicket(String ticketCode, Event eventType, String eventName, String date, String place, int seatNumber, String showTitle, int row, boolean studentDiscount) {
        super(ticketCode, eventType, eventName, date, place, seatNumber);
        this.showTitle = showTitle;
        this.row = row;
        this.studentDiscount = studentDiscount;
    }
    public String getShowTitle() {
        return showTitle;
    }
    public int getRow() {
        return row;
    }
    public boolean isStudentDiscount() {
        return studentDiscount;
    }

    @Override
    public double calculateTicketPrice() {
        if(studentDiscount) {
            return 30.0 * 0.80;
        }
        else {
            return 30.0;
        }
    }

    @Override
    public String toString() {
        return getEventType().toString() + " - " + getEventName() + " | Spettacolo: " + getShowTitle() + " | Fila: " + getRow() + " | Prezzo: " + calculateTicketPrice() + "";

    }
}
