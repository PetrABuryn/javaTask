package app.bo.fleet;

import app.bo.transport.Transport;
import app.enums.Brand;
import app.enums.Engine;
import app.exceptions.TransportException;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class TransportFleet {

    String nullMessage = "'%s' argument should not be null";

    private List<Transport> vehicles;

    protected TransportFleet(List<Transport> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Transport> getVehicles() {
        return vehicles;
    }

    public void sortVehiclesByFuelConsumption() {
        vehicles.sort(Comparator.comparing(Transport::getFuelConsumption).reversed());
    }

    public List<Transport> findVehicles(Brand brand, Engine engine, Double cost, Double fuelConsumption) {
        List<Transport> vs = vehicles.stream()
                .filter(v -> v.getBrand() == Objects.requireNonNull(brand, "Brand argument should not be null"))
                .filter(v -> v.getEngine() == Objects.requireNonNull(engine, "Engine argument should not be null"))
                .filter(v -> v.getCost() == Objects.requireNonNull(cost, "cost argument should not be null"))
                .filter(v -> v.getFuelConsumption() == Objects.requireNonNull(fuelConsumption, "fuelConsumption argument should not be null"))
                .toList();
        if (vs.isEmpty()) {
            throw new TransportException(String.format("No vehicle found as per params: brand '%s', engine '%s', cost: %s, fuel consumption: %s", brand, engine, cost, fuelConsumption));
        }
        return vs;
    }

    public List<Transport> findVehicles(List<Predicate<Transport>> predicates) {
        List<Transport> vs = vehicles.stream()
                .filter(predicates.stream().reduce(p -> true, Predicate::and))
                .toList();
        if (vs.isEmpty()) {
            throw new TransportException("No vehicle found as per filters: " + predicates);
        }
        return vs;
    }

    public double getFleetTotalCost() {
        return vehicles.stream().mapToDouble(Transport::getCost).sum();
    }
}
