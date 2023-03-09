package app.bo.transport.ground;

import app.bo.transport.GroundTransport;
import app.enums.Brand;
import app.enums.Engine;

public class Trolleybus extends GroundTransport {
    public Trolleybus(Brand brand, Engine engine, double cost, double fuelConsumption) {
        super(brand, engine, cost, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Trolleybus{" +
                "brand=" + brand +
                ", engine=" + engine +
                ", cost=" + cost +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
