package cane.brothers.solid.srp.solution;

import lombok.Data;

@Data
public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }
}
