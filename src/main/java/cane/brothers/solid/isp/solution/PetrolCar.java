package cane.brothers.solid.isp.solution;

import lombok.Data;

@Data
public class PetrolCar implements FuelableVehicle {

    private final int maxFuel;
    private int remainingFuel;

    public PetrolCar(final int maxFuel) {
        this.maxFuel = maxFuel;
    }

    @Override
    public void fuel() {
        this.remainingFuel = maxFuel;
    }
}
