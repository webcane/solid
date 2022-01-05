package cane.brothers.solid.lsp.violation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ATCarTest {

    @Test()
    void test_changeGear() {
        ATCar car = new ATCar();
        car.changeGear(Gear.D);
        assertEquals(Gear.D, car.getGear());

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
            car.changeGear(Gear.R);
        });
        Assertions.assertEquals("Can't change to REVERSE gear when D gear is engaged!", thrown.getMessage());
    }
}