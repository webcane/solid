package cane.brothers.solid.dip.solution;

import lombok.Data;
import lombok.experimental.NonFinal;

@Data
@NonFinal
public abstract class Vehicle {
    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void fuel() {
        this.remainingFuel = maxFuel;
    }

    abstract void accelerate();
}
