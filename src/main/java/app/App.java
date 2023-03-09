package app;

import app.bo.fleet.TransportFleet;
import app.bo.transport.Transport;
import app.enums.Brand;
import app.enums.Engine;
import app.enums.Vehicle;
import app.utils.TransportFactory;

public class App {

    public static void main(String[] args) throws Exception {
        TransportFleet busFleet = TransportFactory.getTransportFleet(Vehicle.BUS);
        System.out.println("Bus fleet total cost is " + busFleet.getFleetTotalCost());
        Transport bus = busFleet.findVehicle(Brand.BKM, Engine.ICE, 15.0, 37.0);

        TransportFleet trolleybusFleet = TransportFactory.getTransportFleet(Vehicle.TROLLEYBUS);
        System.out.println("Bus fleet total cost is " + trolleybusFleet.getFleetTotalCost());
        Transport trolleybus = trolleybusFleet.findVehicle(Brand.BKM, Engine.ELECTRIC, 25.0, 20.0);
    }

}
