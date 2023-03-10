package app.bo.fleet;

import app.bo.transport.ground.GroundVehicle;

import java.util.List;

public class BusFleet extends Fleet {
    public BusFleet(List<GroundVehicle> vehicles) {
        super(vehicles);
    }
}
