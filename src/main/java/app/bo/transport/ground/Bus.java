package app.bo.transport.ground;

import app.bo.transport.GroundVehicle;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;

public class Bus extends Vehicle implements GroundVehicle {
    public Bus(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand=" + brand +
                ", engine=" + engine +
                ", cost=" + cost +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
