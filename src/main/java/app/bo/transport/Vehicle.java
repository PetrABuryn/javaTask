package app.bo.transport;

import app.enums.Brand;
import app.enums.Engine;

public interface Vehicle {

    Brand getBrand();

    void setBrand(Brand brand);

    Engine getEngine();

    void setEngine(Engine engine);

    double getCost();

    void setCost(double cost);

    double getFuelConsumption();

    void setFuelConsumption(double fuelConsumption);

}
