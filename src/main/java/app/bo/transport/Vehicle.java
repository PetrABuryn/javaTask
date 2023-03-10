package app.bo.transport;

import app.enums.Brand;
import app.enums.Engine;

public abstract class Vehicle implements IVehicle {

    private static int numberOfVehicles;
    private Brand brand;
    private Engine engine;
    private double cost;
    private double fuelConsumption;
    private int speed;

    protected Vehicle(Brand brand, Engine engine, double cost, double fuelConsumption) {
        this.brand = brand;
        this.engine = engine;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        numberOfVehicles++;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaxPermittedSpeed() {
        this.speed = 100;
    }
}
