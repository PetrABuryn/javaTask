package app;

import app.bo.fleet.Fleet;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.VehicleType;
import app.utils.TransportFleetFactory;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Fleet busFleet = TransportFleetFactory.getTransportFleet(VehicleType.BUS);
        System.out.println("Bus fleet total cost is " + busFleet.getFleetTotalCost());

        List<Vehicle> buses = busFleet.findVehicles(Brand.SKODA, null, null, 24.0);
        System.out.println("Found vehicles: " + buses);

        Fleet trolleybusFleet = TransportFleetFactory.getTransportFleet(VehicleType.TROLLEYBUS);
        System.out.println("Trolleybus fleet total cost is " + trolleybusFleet.getFleetTotalCost());

        List<Vehicle> trBuses = trolleybusFleet.findVehicles(Brand.SKODA, null, null, null);
        System.out.println("Found vehicles: " + trBuses);
    }
}
