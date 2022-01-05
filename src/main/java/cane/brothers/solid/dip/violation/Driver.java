package cane.brothers.solid.dip.violation;

public class Driver {

    private RacingCar vehicle;

    public Driver() {
        this.vehicle = new RacingCar(5000);
    }

    public void drive() {
        vehicle.accelerate();
    }
}
