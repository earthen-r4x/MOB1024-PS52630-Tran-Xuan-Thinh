package com.poly.cinejava;

import com.poly.cinejava.model.Ticket;
import com.poly.cinejava.service.TicketService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ticket> tickets = TicketService.createSampleTickets();

        System.out.println("===== DANH SACH VE =====");
        TicketService.printAll(tickets);

        System.out.print("\nVe dat nhat: ");
        Ticket maxTicket = TicketService.findMostExpensive(tickets);
        if (maxTicket != null) {
            maxTicket.printInfo();
        }

        System.out.println("\n===== DU LIEU LOI =====");
        TicketService.addInvalidTickets(tickets);

        System.out.println("\n===== NHAP VE TU CHUOI =====");
        String[] lines = {
            "VIP;V03;Mai;100000;0.15",
            "STUDENT;S02;Dune;abc;10",
            "NORMAL;;Mai;90000;0",
            "STUDENT;S03;Exhuma;95000;30"
        };
        TicketService.importFromLines(tickets, lines);

        System.out.println("\nTong so ve: " + tickets.size());
    }
}