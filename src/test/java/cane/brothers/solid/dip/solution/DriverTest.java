package cane.brothers.solid.dip.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DriverTest {

    @Test
    void test_racinCar_drive() {
        //old nag
        Vehicle car = new RacingCar(5000);
        car.fuel();
        Driver braveDriver = new Driver(car);

        for (int i = 0; i < 1000; i++) {
            braveDriver.drive();
        }

        assertEquals(3000, car.getRemainingFuel());
    }

    @Test
    void test_auto_drive() {
        //old nag
        Vehicle car = new DasAuto(5000);
        car.fuel();
        Driver oldDriver = new Driver(car);

        for (int i = 0; i < 1000; i++) {
            oldDriver.drive();
        }

        assertEquals(4000, car.getRemainingFuel());
    }
}