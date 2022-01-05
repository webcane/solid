package cane.brothers.solid.dip.violation;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RacingCar {

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public void fuel() {
        this.remainingFuel = maxFuel;
    }

    public void accelerate() {
        power++;
        remainingFuel--;
    }
}
