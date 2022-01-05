package cane.brothers.solid.dip.solution;

public class RacingCar extends Vehicle {

    public RacingCar(final int maxFuel) {
        super(maxFuel);
    }

    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() -2);
    }
}
