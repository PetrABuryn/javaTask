package app;

import app.bo.transport.Transport;
import app.bo.transport.ground.Bus;
import app.bo.transport.ground.Trolleybus;
import app.enums.Brand;
import app.enums.Engine;

public class TransportFactory {

    Transport bus1 = new Bus(Brand.BKM, Engine.ICE, 15.0, 37.0);
    Transport bus2 = new Bus(Brand.BKM, Engine.ICE, 18.5, 35.0);
    Transport bus3 = new Bus(Brand.SCHULER, Engine.ICE, 32.0, 24.0);
    Transport bus4 = new Bus(Brand.SCHULER, Engine.ICE, 70.0, 14.0);
    Transport bus5 = new Bus(Brand.SCHULER, Engine.ICE, 75.0, 14.0);
    Transport bus6 = new Bus(Brand.SKODA, Engine.ICE, 32.0, 24.0);
    Transport bus7 = new Bus(Brand.SKODA, Engine.ICE, 28.0, 20.0);

    Transport tBus1 = new Trolleybus(Brand.BKM, Engine.ELECTRIC, 25.0, 20.0);
    Transport tBus2 = new Trolleybus(Brand.BKM, Engine.ELECTRIC, 12.0, 43.0);
    Transport tBus3 = new Trolleybus(Brand.BKM, Engine.ELECTRIC, 19.2, 54.0);
    Transport tBus4 = new Trolleybus(Brand.SKODA, Engine.ELECTRIC, 42.0, 24.0);
    Transport tBus5 = new Trolleybus(Brand.SKODA, Engine.ELECTRIC, 32.0, 15.5);
    Transport tBus6 = new Trolleybus(Brand.SKODA, Engine.ELECTRIC, 36.0, 19.9);


}
