package cane.brothers.solid.ocp.solution.vehicle;

public enum DrivingModes implements DrivingMode {
    SPORT(500, 10),
    COMFORT(400, 20),
    ECONOMY(300, 15);

    private int power;
    private int suspensionHeight;

    DrivingModes(int power, int suspensionHeight) {
        this.power = power;
        this.suspensionHeight = suspensionHeight;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public int getSuspensionHeight() {
        return this.suspensionHeight;
    }
}
