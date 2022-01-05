package cane.brothers.solid.isp.solution;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ElectricCar implements ChargeableVehicle {

    private final int batterySize;
    private Current current;
    private int voltage;

    ElectricCar(int batterySize) {
        this.batterySize = batterySize;
    }

    public void connect(Current current, int voltage) {
        this.current = current;
        this.voltage = voltage;
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
        log.info("rapid charge");
    }

    private void fastCharge() {
        log.info("fast charge");
    }

    private void slowCharge() {
        log.info("slow charge");
    }

    private boolean isSmallBattery() {
        return (40 < this.batterySize? true : false);
    }

    private boolean isHightVoltage() {
        return (380 >= this.voltage? true : false);
    }
}
