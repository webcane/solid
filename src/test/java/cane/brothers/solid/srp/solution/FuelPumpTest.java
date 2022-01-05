package cane.brothers.solid.srp.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuelPumpTest {

    @Test
    void test_reFuel() {
        Vehicle vehicle = new Vehicle(5000);
        FuelPump pump = new FuelPump();

        boolean isReFuel = pump.reFuel(vehicle, 5000);

        assertEquals(true, isReFuel);
        assertEquals(5000, vehicle.getRemainingFuel());

        for (int i=0; i<3000; i++) {
            vehicle.accelerate();
        }
        isReFuel = pump.reFuel(vehicle, 1500);

        assertEquals(true, isReFuel);
        assertEquals(3500, vehicle.getRemainingFuel());
    }
}