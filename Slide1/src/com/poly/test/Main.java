package com.poly.test;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("T001", "Concert A", 150.0));
        tickets.add(new Ticket("T002", "Concert B", 300.0));
        tickets.add(new Ticket("T003", "Concert C", 210.0));
        tickets.add(new Ticket("T004", "Concert D", 110.0));
        tickets.add(new Ticket("T005", "Concert E", 200.0));
        tickets.add(new StudentTicket("ST001", "Student Concert A", 320.0, 20));
        tickets.add(new StudentTicket("ST002", "Student Concert B", 250.0, 15));

        // Print
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }

        // Sort by finalPrice
        tickets.sort((t1, t2) -> Double.compare(t1.finalPrice(), t2.finalPrice()));
        System.out.println("\nAfter sorting by finalPrice:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }

        // Highest finalPrice
        Ticket highestFinalPriceTicket = tickets.get(0);
        for (Ticket ticket : tickets) {
            if (ticket.finalPrice() > highestFinalPriceTicket.finalPrice()) {
                highestFinalPriceTicket = ticket;
            }
        }
        System.out.println("\nTicket with highest final price:");
        System.out.println(highestFinalPriceTicket);
    }
}
