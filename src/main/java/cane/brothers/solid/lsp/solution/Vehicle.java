package cane.brothers.solid.lsp.solution;

import lombok.Data;
import lombok.experimental.NonFinal;

@Data
@NonFinal
public abstract class Vehicle {

    private Gear gear;
    private boolean isMoving;

    public void move(){
        isMoving = true;
    }

    public void stop(){
        isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void changeGear(Gear gear) {
        this.gear = gear;
    }
}
