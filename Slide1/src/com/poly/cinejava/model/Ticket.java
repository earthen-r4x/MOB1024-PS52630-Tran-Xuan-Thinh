package com.poly.cinejava.model;

public class Ticket {
    private String id;
    private String movie;
    private double basePrice;

    public Ticket() {}
    public Ticket(String id, String movie, double basePrice) {
        this.setId(id);
        this.setMovie(movie);
        this.setBasePrice(basePrice);
    }

    public String getId() {
        return id;
    }

    public String getMovie() {
        return movie;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        if (id.isEmpty() || id == null) {
            System.out.println("Ma ve rong");
        } else {
            this.id = id;
        }
    }

    public void setMovie(String movie) {
        if (movie.isEmpty() || movie == null) {
            System.out.println("Ten phim rong");
        } else {
            this.movie = movie;
        }
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0) {
            System.out.println("Gia ve phai >= 0");
        } else {
            this.basePrice = basePrice;
        }
    }
    
    public double finalPrice() {
        return basePrice;
    }

    public void printInfo() {
        System.out.printf("%-5s | %-12s | %,10.0f%n", getId(), getMovie(), finalPrice());
    }
}
