package model;

public class TandemChair extends Chair {
    private int seats;

    public TandemChair(String reference, int price, double rating, int seats) {
        super(reference, price, rating);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
}