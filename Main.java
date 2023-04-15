package com.Day31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int n = sc.nextInt();

        System.out.print("Enter the available tickets: ");
        int availableTickets = sc.nextInt();
        Ticket.setAvailableTickets(availableTickets);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the ticketid: ");
            int ticketid = sc.nextInt();

            System.out.print("Enter the price: ");
            int price = sc.nextInt();

            System.out.print("Enter the no of tickets: ");
            int nooftickets = sc.nextInt();

            Ticket ticket = new Ticket();
            ticket.setTicketid(ticketid);
            ticket.setPrice(price);

            int totalAmount = ticket.calculateTicketCost(nooftickets);
            if (totalAmount == -1) {
                System.out.println("Tickets not available!");
            } else {
                System.out.println("Available tickets: " + Ticket.getAvailableTickets());
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
            }
        }

        sc.close();
    }
}

