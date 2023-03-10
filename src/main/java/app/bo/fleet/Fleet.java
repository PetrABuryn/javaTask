package app.bo.fleet;

import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;
import app.exceptions.VehicleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class Fleet {
    private static final Logger log = LoggerFactory.getLogger(Fleet.class);

    private final List<Vehicle> vehicles;

    protected Fleet(List<Vehicle> vehicles) {
        this.vehicles = new ArrayList<>(vehicles);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void sortVehiclesByFuelConsumption() {
        vehicles.sort(Comparator.comparing(Vehicle::getFuelConsumption));
    }

    public List<Vehicle> findVehicles(Brand brand, Engine engine, Double cost, Double fuelConsumption) {
        List<Vehicle> vs = vehicles.stream()
                .filter(v -> {
                    if (Optional.ofNullable(brand).isPresent()) {
                        return v.getBrand().equals(brand);
                    }
                    return true;
                })
                .filter(v -> {
                    if (Optional.ofNullable(engine).isPresent()) {
                        return v.getEngine() == engine;
                    }
                    return true;
                })
                .filter(v -> {
                    if (Optional.ofNullable(cost).isPresent()) {
                        return v.getCost() == cost;
                    }
                    return true;
                })
                .filter(v -> {
                    if (Optional.ofNullable(fuelConsumption).isPresent()) {
                        return v.getFuelConsumption() == fuelConsumption;
                    }
                    return true;
                })
                .toList();

        StringBuilder errorMessage = new StringBuilder("No vehicle found as per your search params:\n");
        Optional.ofNullable(brand).ifPresent(b -> errorMessage.append("brand: ").append(b.name()).append("\n"));
        Optional.ofNullable(engine).ifPresent(b -> errorMessage.append("engine: ").append(b.name()).append("\n"));
        Optional.ofNullable(cost).ifPresent(b -> errorMessage.append("cost: ").append(cost).append("\n"));
        Optional.ofNullable(fuelConsumption).ifPresent(b -> errorMessage.append("fuel consumption: ").append(fuelConsumption));

        if (vs.isEmpty()) {
            throw new VehicleException(errorMessage.toString());
        }
        return vs;
    }

    public List<Vehicle> findVehicles(List<Predicate<Vehicle>> predicates) {
        List<Vehicle> vs = vehicles.stream()
                .filter(predicates.stream().reduce(p -> true, Predicate::and))
                .toList();
        if (vs.isEmpty()) {
            throw new VehicleException("No vehicle found as per the filters");
        }
        return vs;
    }

    public void printVehicles() {
        this.vehicles.forEach(v -> log.info("{}", v));
    }

    public double getFleetTotalCost() {
        return vehicles.stream().mapToDouble(Vehicle::getCost).sum();
    }
}
