package cane.brothers.solid.lsp.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATCarTest {

    @Test
    void test_changeGear() {
        ATCar car = new ATCar();
        car.changeGear(Gear.D);
        assertEquals(Gear.D, car.getGear());

        car.changeGear(Gear.R);
        assertEquals(Gear.R, car.getGear());
    }
}