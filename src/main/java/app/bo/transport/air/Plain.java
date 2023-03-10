package app.bo.transport.air;

import app.bo.transport.AirVehicle;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;

public class Plain extends Vehicle implements AirVehicle {

    private static final int MAX_SPEED = 600;
    private double wingSpan = 120.0;

    protected Plain(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }

    @Override
    public double getWingSpan() {
        return wingSpan;
    }

    @Override
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public final void setMaxPermittedSpeed() {
        super.setSpeed(MAX_SPEED);
    }
}
