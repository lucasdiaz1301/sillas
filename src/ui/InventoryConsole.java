package ui;

import java.util.List;

import model.Chair;

public class InventoryConsole {

    public void displayResults(List<Chair> chairs) {
        for (Chair chair : chairs) {
            String status = chair.shouldBeRemoved() ? "remove" : "keep";
            System.out.println(chair.getReference() + ", " + status);
        }
    }
}