package com.poly.cinejava.service;

import com.poly.cinejava.model.StudentTicket;
import com.poly.cinejava.model.Ticket;
import com.poly.cinejava.model.VipTicket;

import java.util.ArrayList;
import java.util.List;
public class TicketService {
    public static List<Ticket> createSampleTickets() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("T01", "Mai", 90000.0));
        tickets.add(new VipTicket("V01", "Dune", 110000.0, 0.2, 30000.0));
        tickets.add(new StudentTicket("S01", "Mai", 90000.0, 20));
        tickets.add(new Ticket("T02", "Exhuma", 100000.0));
        tickets.add(new VipTicket("V02", "Inside Out 2", 90000.0, 0.1, 25000.0));
        return tickets;
    }

    public static void printAll(List<Ticket> tickets) {
        for (Ticket t : tickets) {
            t.printInfo();
        }
    }

    public static Ticket findMostExpensive(List<Ticket> tickets) {
        Ticket max = tickets.get(0);
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).finalPrice() > max.finalPrice()) {
                max = tickets.get(i);
            }
        }
        return max;
    }

    public static void addInvalidTickets(List<Ticket> tickets) {
        try {
            tickets.add(new StudentTicket("S09", "Dune", 90000.0, 70));
        } catch (Exception e) {
            System.out.println("[LOI]: " + e.getMessage());
        }

        try {
            tickets.add(new Ticket("T09", "Mai", -5));
        } catch (Exception e) {
            System.out.println("[LOI]: " + e.getMessage());
        }
    }

    public static Ticket parse(String line) {
        String[] parts = line.split(";");
        String type = parts[0].trim();
        String id = parts[1].trim();
        String movie = parts[2].trim();
        double basePrice = Double.parseDouble(parts[3].trim());
        
        if (type.equalsIgnoreCase("VIP")) {
            double surchargeRate = Double.parseDouble(parts[4].trim());
            return new VipTicket(id, movie, basePrice, surchargeRate, 30000.0);
        } else if (type.equalsIgnoreCase("STUDENT")) {
            int discountPercent = Integer.parseInt(parts[4].trim());
            return new StudentTicket(id, movie, basePrice, discountPercent);
        } else {
            return new Ticket(id, movie, basePrice);
        }
    }

    public static void importFromLines(List<Ticket> tickets, String[] lines) {
        for (String line : lines) {
            try {
                Ticket t = parse(line);
                tickets.add(t);
                System.out.print("OK     ");
                t.printInfo();
            } catch (NumberFormatException e) {
                System.out.println("[LOI SO] " + line);
            } catch (IllegalArgumentException e) {
                System.out.println("[LOI] " + line + " -> " + e.getMessage());
            }
        }
    }
}
