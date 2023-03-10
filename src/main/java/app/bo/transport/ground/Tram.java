package app.bo.transport.ground;

import app.enums.Brand;
import app.enums.Engine;

public class Tram extends GroundVehicle {
    public Tram(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }
}
