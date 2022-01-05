package cane.brothers.solid.lsp.violation;

public class ATCar extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        if(Gear.D.equals(getGear()) && Gear.R.equals(gear)){
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
        super.changeGear(gear);
    }
}
