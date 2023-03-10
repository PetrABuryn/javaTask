package app;

import app.bo.fleet.Fleet;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;
import app.enums.VehicleType;
import app.utils.TransportFleetFactory;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Fleet busFleet = TransportFleetFactory.getTransportFleet(VehicleType.BUS);
        Fleet trolleybusFleet = TransportFleetFactory.getTransportFleet(VehicleType.TROLLEYBUS);
        /*
         * Print out Buss fleet vehicles
         */
        System.out.println("Bus fleet");
        busFleet.getVehicles().forEach(System.out::println);
        System.out.println();
        /*
         * Print out Buss fleet vehicles sorted by fuel consumption
         */
        System.out.println("Bus fleet sorted by fuel consumption");
        List<Vehicle> busFleetSorted = busFleet.sortVehiclesByFuelConsumption();
        busFleetSorted.forEach(System.out::println);
        System.out.println();
        /*
         * Print out Buss fleet vehicles total cost
         */
        System.out.println("Bus fleet total cost is " + busFleet.getFleetTotalCost());
        System.out.println();
        /*
         * Print out Buss fleet vehicles filtered by the params
         * If argument is null then it is ignored while filtering
         */
        System.out.println("Bus fleet vehicles filtered by the params");
        List<Vehicle> buses = busFleet.findVehicles(Brand.SKODA, null, null, 24.0);
        System.out.println("Found vehicles: " + buses);
        System.out.println();
        /*
         * Print out Trolleybus fleet vehicles sorted by fuel consumption
         */
        System.out.println("Trolleybus fleet");
        trolleybusFleet.getVehicles().forEach(System.out::println);
        System.out.println();
        /*
         * Print out trolleybus fleet vehicles sorted by fuel consumption
         */
        System.out.println("Trolleybus fleet total cost is " + trolleybusFleet.getFleetTotalCost());
        System.out.println();
        /*
         * Print out Trolleybus fleet vehicles filtered by the params
         * If argument is null then it is ignored while filtering
         */
        System.out.println("Bus fleet vehicles filtered by the params");
        System.out.println("Throws exception as no vehicles found");
        List<Vehicle> trBuses = trolleybusFleet.findVehicles(Brand.SCHULER, Engine.ICE, null, 24.0);
        System.out.println("Found vehicles: " + trBuses);
    }
}
