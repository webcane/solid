package cane.brothers.solid.ocp.solution.vehicle;

import lombok.Data;

@Data
public class Vehicle {
    private DrivingMode drivingMode = DrivingModes.SPORT;
}
