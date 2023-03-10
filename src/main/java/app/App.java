package app;

import app.bo.fleet.Fleet;
import app.bo.transport.Vehicle;
import app.enums.Brand;
import app.enums.Engine;
import app.enums.VehicleType;
import app.utils.TransportFleetFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        Fleet busFleet = TransportFleetFactory.getTransportFleet(VehicleType.BUS);
        Fleet trolleybusFleet = TransportFleetFactory.getTransportFleet(VehicleType.TROLLEYBUS);
        /*
         * Print out Buss fleet vehicles
         */
        log.info("Bus fleet:");
        busFleet.printVehicles();
        /*
         * Print out Buss fleet vehicles sorted by fuel consumption
         */
        log.info("Bus fleet sorted by fuel consumption:");
        busFleet.sortVehiclesByFuelConsumption();
        busFleet.printVehicles();
        /*
         * Print out Buss fleet vehicles total cost
         */
        log.info("Bus fleet total cost is '{}'", busFleet.getFleetTotalCost());
        /*
         * Print out Buss fleet vehicles filtered by the params
         * If argument is null then it is ignored while filtering
         */
        List<Vehicle> buses = busFleet.findVehicles(Brand.SKODA, null, null, 24.0);
        log.info("Bus fleet vehicles filtered by the params: {}", buses);
        /*
         * Print out Trolleybus fleet vehicles sorted by fuel consumption
         */
        log.info("Trolleybus fleet:");
        trolleybusFleet.printVehicles();
        /*
         * Print out trolleybus fleet vehicles sorted by fuel consumption
         */
        log.info("Trolleybus fleet total cost is '{}'", trolleybusFleet.getFleetTotalCost());
        /*
         * Print out Trolleybus fleet vehicles filtered by the params
         * If argument is null then it is ignored while filtering
         */
        log.info("Trolleybus fleet vehicles filtered by the params");
        log.info("Throws exception as no vehicles found");
        List<Vehicle> trBuses = trolleybusFleet.findVehicles(Brand.SCHULER, Engine.ICE, null, 24.0);
        log.info("Found vehicles: {}", trBuses);
    }
}
