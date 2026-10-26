package model;

public abstract class Chair {
    private String reference;
    private int price;
    private double rating;

    protected Chair(String reference, int price, double rating) {
        this.reference = reference;
        this.price = price;
        this.rating = rating;
    }

    public String getReference() {
        return reference;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}