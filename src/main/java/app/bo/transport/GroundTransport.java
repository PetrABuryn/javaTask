package app.bo.transport;

import app.enums.Brand;
import app.enums.Engine;

public abstract class GroundTransport implements Transport {
    protected Brand brand;
    protected Engine engine;
    protected double cost;
    protected double fuelConsumption;


    public GroundTransport(Brand brand, Engine engine, double cost, double fuelConsumption) {
        this.brand = brand;
        this.engine = engine;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
    }
}
