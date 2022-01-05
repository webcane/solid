package cane.brothers.solid.isp.violation;

import lombok.Data;

@Data
public class PetrolCar implements Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    public PetrolCar(final int maxFuel) {
        this.maxFuel = maxFuel;
    }

    @Override
    public void fuel() {
        this.remainingFuel = maxFuel;
    }

    @Override
    public void charge() {
        // nothing to do here
    }
}
