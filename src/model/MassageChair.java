package model;

public class MassageChair extends Chair {
    private int numberPrograms;
    private boolean heating;

    public MassageChair(String reference, int price, double rating, int numberPrograms, boolean heating) {
        super(reference, price, rating);
        this.numberPrograms = numberPrograms;
        this.heating = heating;
    }

    public int getNumberPrograms() {
        return numberPrograms;
    }

    public boolean hasHeating() {
        return heating;
    }
}