package app.bo.fleet;

import app.bo.transport.Vehicle;
import app.bo.transport.ground.GroundVehicle;

import java.util.List;

public class TrolleybusFleet extends Fleet {
    public TrolleybusFleet(List<GroundVehicle> vehicles) {
        super(vehicles);
    }
}
