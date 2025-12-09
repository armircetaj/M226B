package ch.samt.ticketmanager.model;

import ch.samt.ticketmanager.enumerator.Event;

public interface TicketStructure {
    double calculateTicketPrice();
    void sellTicket();
    Event getEventType();
    String isSold();
}
