package cane.brothers.solid.dip.solution;

public class DasAuto extends Vehicle {

    public DasAuto(final int maxFuel) {
        super(maxFuel);
    }

    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() -1);
    }
}
