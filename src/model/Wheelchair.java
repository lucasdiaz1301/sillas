package model;

public class Wheelchair extends Chair {
    private String driveType; // "manual" o "automática"

    public Wheelchair(String reference, int price, double rating, String driveType) {
        super(reference, price, rating);
        this.driveType = driveType;
    }

    public String getDriveType() {
        return driveType;
    }
}