package app.bo.transport.river;

import app.bo.transport.RiverVehicle;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;

public class RiverTram extends Vehicle implements RiverVehicle {
    protected RiverTram(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }
}
