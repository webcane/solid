package cane.brothers.solid.ocp.violation.vehicle;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DrivingModeHandler {
    private Vehicle vehicle;

    public void changeDrivingMode(final DrivingMode drivingMode){
        switch (drivingMode){
            case SPORT:
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
                break;
            case COMFORT:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
            // when we need to add another mode (e.g. ECONOMY) 2 classes will change DrivingMode and EventHandler.
        }
    }
}
