package app.bo.fleet;

import app.bo.transport.Transport;
import app.enums.Brand;
import app.enums.Engine;
import app.exceptions.TransportException;

public abstract class TransportFleet {

    private Transport[] vehicles;

    protected TransportFleet(Transport[] vehicles) {
        this.vehicles = vehicles;
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public Transport[] sortVehiclesByFuelConsumption() {
        return null;
    }

    public Transport findVehicle(Brand brand, Engine engine, Double cost, Double fuelConsumption) {
        if (brand == null) {
            throw new TransportException("Brand argument should not be null");
        }
        if (engine == null) {
            throw new TransportException("Engine argument should not be null");
        }
        if (cost == null) {
            throw new TransportException("cost argument should not be null");
        }
        if (fuelConsumption == null) {
            throw new TransportException("fuelConsumption argument should not be null");
        }
        for (Transport vehicle : vehicles) {
            if (vehicle.getBrand() == brand
                    && vehicle.getEngine() == engine
                    && vehicle.getCost() == cost
                    && vehicle.getFuelConsumption() == fuelConsumption) {
                return vehicle;
            }
        }
        throw new TransportException(String.format("No transport found as per your request: brand '%s', engine '%s', cost: %s, fuel consumption: %s", brand, engine, cost, fuelConsumption));
    }

    public double getFleetTotalCost() {
        double cost = 0;
        for (Transport vehicle : vehicles) {
            cost += vehicle.getCost();
        }
        return cost;
    }
}
