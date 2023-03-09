package app.bo.fleet;

import app.bo.transport.Transport;

import java.util.List;

public class BusFleet extends TransportFleet{
    public BusFleet(List<Transport> vehicles) {
        super(vehicles);
    }
}
