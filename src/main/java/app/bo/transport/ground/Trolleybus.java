package app.bo.transport.ground;

import app.bo.transport.GroundVehicle;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;

public class Trolleybus extends Vehicle implements GroundVehicle {

    private static final int MAX_SPEED = 90;

    public Trolleybus(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }

    public final void setMaxPermittedSpeed() {
        super.setSpeed(MAX_SPEED);
    }

    @Override
    public String toString() {
        return "Trolleybus{" +
                "brand=" + getBrand() +
                ", engine=" + getEngine() +
                ", cost=" + getCost() +
                ", fuelConsumption=" + getFuelConsumption() +
                '}';
    }
}
