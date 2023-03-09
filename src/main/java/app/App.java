package app;

import app.bo.fleet.TransportFleet;
import app.bo.transport.Transport;
import app.enums.Brand;
import app.enums.Engine;
import app.enums.Vehicle;
import app.utils.TransportFactory;

import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        Predicate<Transport> brandFilter = v -> v.getBrand() == Brand.BKM;
        Predicate<Transport> engineFilter = v -> v.getEngine() == Engine.ELECTRIC;

        List<Predicate<Transport>> filters = List.of(brandFilter, engineFilter);

        TransportFleet busFleet = TransportFactory.getTransportFleet(Vehicle.BUS);
        System.out.println("Bus fleet total cost is " + busFleet.getFleetTotalCost());
        List<Transport> buses = busFleet.findVehicles(Brand.BKM, Engine.ICE, 15.0, 37.0);
        System.out.println("Found vehicles: " + buses);

        TransportFleet trolleybusFleet = TransportFactory.getTransportFleet(Vehicle.TROLLEYBUS);
        System.out.println("Trolleybus fleet total cost is " + trolleybusFleet.getFleetTotalCost());
//        List<Transport> trolleybuses = trolleybusFleet.findVehicles(Brand.BKM, Engine.ELECTRIC, 2.0, 20.0);
//        System.out.println("Found vehicles: " + trolleybuses);

        List<Transport> vs = trolleybusFleet.findVehicles(filters);
        System.out.println(vs);
    }
}
