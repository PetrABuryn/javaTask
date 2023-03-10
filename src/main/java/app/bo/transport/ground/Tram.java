package app.bo.transport.ground;

import app.bo.transport.GroundVehicle;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;

public class Tram extends Vehicle implements GroundVehicle {

    private static final int MAX_SPEED = 60;

    public Tram(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }

    @Override
    public void setMaxPermittedSpeed() {
        super.setSpeed(MAX_SPEED);
    }
}
