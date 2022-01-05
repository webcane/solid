package cane.brothers.solid.isp.solution;

public interface ChargeableVehicle {

    enum Current {
        AC, // alternating current
        DC; // direct current
    }

    void connect(ElectricCar.Current current, int voltage);
    void charge();
}
