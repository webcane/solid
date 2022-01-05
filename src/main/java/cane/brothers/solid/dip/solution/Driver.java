package cane.brothers.solid.dip.solution;

public class Driver {

    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.vehicle.fuel();
    }

    public void drive() {
        vehicle.accelerate();
    }
}
