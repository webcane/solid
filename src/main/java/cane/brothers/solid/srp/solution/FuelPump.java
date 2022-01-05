package cane.brothers.solid.srp.solution;

public class FuelPump {

    public boolean reFuel(final Vehicle vehicle, int additionalFuel){
        final int remainingFuel = vehicle.getRemainingFuel();
        if (additionalFuel > vehicle.getMaxFuel() - remainingFuel) {
            return false;
        }

        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
        return true;
    }
}
