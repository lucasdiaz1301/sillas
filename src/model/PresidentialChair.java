package model;

public class PresidentialChair extends Chair implements removable {
    private boolean imported;

    public PresidentialChair(String reference, int price, double rating, boolean imported) {
        super(reference, price, rating);
        this.imported = imported;
    }

    public boolean isImported() {
        return imported;
    }

    @Override
    public boolean shouldBeRemoved() {
        return imported && (getRating() < 3.5 || getPrice() > 400_000);
    }
}