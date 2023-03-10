package app.bo.transport.ground;

import app.enums.Brand;
import app.enums.Engine;

public class Train extends GroundVehicle {
    public Train(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }
}
