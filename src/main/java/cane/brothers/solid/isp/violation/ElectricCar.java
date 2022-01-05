package cane.brothers.solid.isp.violation;

import lombok.Data;

@Data
public class ElectricCar implements Vehicle {

    private final int batterySize;
    private ElectricCar.Current current;
    private int voltage;

    enum Current {
        AC, // alternating current
        DC; // direct current
    }

    ElectricCar(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public void fuel() {
        // nothing to do here
    }

    public void connect(Current current, int voltage) {
        this.current = current;
    }

    @Override
    public void charge() {
        if(Current.DC.equals(current)) {
            rapidCharge();
        }

        else if(isSmallBattery() && isHightVoltage()) {
            fastCharge();
        }

        else {
            slowCharge();
        }
    }

    private void rapidCharge() {
        // rapid charge
    }

    private void fastCharge() {
        // fast charge
    }

    private void slowCharge() {
        // slow charge
    }

    private boolean isSmallBattery() {
        return (40 < this.batterySize? true : false);
    }

    private boolean isHightVoltage() {
        return (380 >= this.voltage? true : false);
    }
}
