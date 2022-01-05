package cane.brothers.solid.ocp.solution.vehicle;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DrivingModeHandler {
    private Vehicle vehicle;

    public void changeDrivingMode(final DrivingMode drivingMode){
        vehicle.setDrivingMode(drivingMode);
    }
}
