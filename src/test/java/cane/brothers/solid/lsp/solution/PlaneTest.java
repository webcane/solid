package cane.brothers.solid.lsp.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaneTest {

    @Test
    void test_changeGear() {
        Plane plane = new Plane();
        plane.changeGear(Gear.D);
        assertEquals(Gear.D, plane.getGear());

        plane.changeGear(Gear.R);
        assertEquals(Gear.R, plane.getGear());
    }
}