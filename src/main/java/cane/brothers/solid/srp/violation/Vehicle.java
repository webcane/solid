package cane.brothers.solid.srp.violation;

import lombok.Data;

@Data
public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        reFuel();
    }

    // this is not a car's responsibility.
    public void reFuel(){
        remainingFuel = maxFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }
}
