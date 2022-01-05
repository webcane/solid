package cane.brothers.solid.ocp.solution.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrivingModeHandlerTest {

    @Test
    public void testDefaultDrivingMode() {
        Vehicle vehicle = new Vehicle();
        assertEquals(DrivingModes.SPORT, vehicle.getDrivingMode());
    }

    @Test
    public void testChangeDrivingMode() {
        Vehicle vehicle = new Vehicle();
        DrivingModeHandler handler = new DrivingModeHandler(vehicle);

        handler.changeDrivingMode(DrivingModes.COMFORT);
        assertEquals(DrivingModes.COMFORT, vehicle.getDrivingMode());

        handler.changeDrivingMode(DrivingModes.ECONOMY);
        assertEquals(15, vehicle.getDrivingMode().getSuspensionHeight());
        assertEquals(300, vehicle.getDrivingMode().getPower());
    }
}