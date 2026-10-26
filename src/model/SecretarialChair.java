package model;

public class SecretarialChair extends Chair implements removable {

    public SecretarialChair(String reference, int price, double rating) {
        super(reference, price, rating);
    }

    @Override
    public boolean shouldBeRemoved() {
        return getRating() < 3.0 || getPrice() > 200_000;
    }
}