package app.bo.transport;

import app.enums.Brand;
import app.enums.Engine;

public abstract class Vehicle {

    protected Brand brand;
    protected Engine engine;
    protected double cost;
    protected double fuelConsumption;

    protected Vehicle(Brand brand, Engine engine, double cost, double fuelConsumption) {
        this.brand = brand;
        this.engine = engine;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
    }

    public Brand getBrand() {
        return brand;
    }

    protected void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
