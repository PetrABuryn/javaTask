package app.utils;

import app.bo.fleet.BusFleet;
import app.bo.fleet.Fleet;
import app.bo.fleet.TrolleybusFleet;
import app.bo.transport.Vehicle;
import app.bo.transport.ground.Bus;
import app.bo.transport.ground.GroundVehicle;
import app.bo.transport.ground.Trolleybus;
import app.enums.Brand;
import app.enums.Engine;
import app.enums.VehicleType;
import app.exceptions.TransportFleetException;

import java.util.List;

public class TransportFleetFactory {


    public static Fleet getTransportFleet(VehicleType vehicleType) {
        switch (vehicleType) {
            case BUS:
                return new BusFleet(getAvailableBuses());
            case TROLLEYBUS:
                return new TrolleybusFleet(getAvailableTrolleybus());
            default:
                throw new TransportFleetException("No such transport fleet found for " + vehicleType);
        }
    }

    private static List<GroundVehicle> getAvailableBuses() {
        return List.of(
                new Bus(Brand.BKM, Engine.ICE, 15.0, 35.0),
                new Bus(Brand.BKM, Engine.ICE, 18.5, 35.0),
                new Bus(Brand.SCHULER, Engine.ICE, 32.0, 24.0),
                new Bus(Brand.SCHULER, Engine.ICE, 70.0, 14.0),
                new Bus(Brand.SCHULER, Engine.ICE, 75.0, 14.0),
                new Bus(Brand.SKODA, Engine.ICE, 32.0, 24.0),
                new Bus(Brand.SKODA, Engine.ICE, 32.0, 20.0)
        );
    }

    private static List<GroundVehicle> getAvailableTrolleybus() {
        return List.of(
                new Trolleybus(Brand.BKM, Engine.ELECTRIC, 25.0, 20.0),
                new Trolleybus(Brand.BKM, Engine.ELECTRIC, 12.0, 43.0),
                new Trolleybus(Brand.BKM, Engine.ELECTRIC, 19.2, 54.0),
                new Trolleybus(Brand.SKODA, Engine.ELECTRIC, 42.0, 24.0),
                new Trolleybus(Brand.SKODA, Engine.ELECTRIC, 32.0, 15.5),
                new Trolleybus(Brand.SKODA, Engine.ELECTRIC, 36.0, 19.9)
        );
    }
}
