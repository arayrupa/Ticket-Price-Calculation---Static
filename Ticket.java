package com.Day31;

import java.util.Scanner;

class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    // Getters and setters
    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets >= 0) {
            Ticket.availableTickets = availableTickets;
        }
    }

    // Method to calculate ticket cost
    public int calculateTicketCost(int nooftickets) {
        if (nooftickets <= availableTickets) {
            availableTickets -= nooftickets;
            return nooftickets * price;
        } else {
            return -1;
        }
    }
}

