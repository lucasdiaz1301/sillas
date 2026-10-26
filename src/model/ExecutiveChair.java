package model;

public class ExecutiveChair extends Chair implements removable {

    public ExecutiveChair(String reference, int price, double rating) {
        super(reference, price, rating);
    }

    @Override
    public boolean shouldBeRemoved() {
        return getRating() < 4.0 || getPrice() > 300_000;
    }
}