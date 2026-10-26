package ui;

import java.util.List;

import model.Chair;
import model.removable;

public class InventoryConsole {

    public void displayResults(List<Chair> chairs) {
        for (Chair chair : chairs) {
            String status = "keep";

            if (chair instanceof removable) {
                removable removableChair = (removable) chair;
                if (removableChair.shouldBeRemoved()) {
                    status = "remove";
                }
            }

            System.out.println(chair.getReference() + ", " + status);
        }
    }
}