package cane.brothers.solid.isp.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetrolStationTest {

    @Test
    public void test_fuel() {
        FuelableVehicle vehicle = new PetrolCar(5000);
        vehicle.fuel();

        assertEquals(5000, vehicle.getRemainingFuel());
    }
}