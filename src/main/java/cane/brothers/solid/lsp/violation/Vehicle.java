package cane.brothers.solid.lsp.violation;

import lombok.Data;
import lombok.experimental.NonFinal;

@Data
@NonFinal
public abstract class Vehicle {

    private Gear gear;

    public void changeGear(Gear gear) {
        this.gear = gear;
    }
}
