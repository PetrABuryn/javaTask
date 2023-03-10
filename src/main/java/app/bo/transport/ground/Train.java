package app.bo.transport.ground;

import app.bo.transport.GroundVehicle;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;

public class Train extends Vehicle implements GroundVehicle {

    private static final int MAX_SPEED = 160;

    public Train(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }

    @Override
    public final void setMaxPermittedSpeed() {
        this.setSpeed(MAX_SPEED);
    }
}
