package app.bo.transport.river;

import app.bo.transport.RiverVehicle;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;

public class RiverTram extends Vehicle implements RiverVehicle {

    private double displacement;

    protected RiverTram(Brand brand, Engine engine, double cost, double fuelConsumption, double displacement) {
        super(brand, engine, cost, fuelConsumption);
        this.displacement = displacement;
    }

    @Override
    public double getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
}
