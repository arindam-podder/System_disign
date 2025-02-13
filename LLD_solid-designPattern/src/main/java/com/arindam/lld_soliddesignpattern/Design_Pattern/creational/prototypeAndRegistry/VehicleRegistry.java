package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.prototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

    private static Map<String, Vehicle<Vehicle>> vehicleMap = new HashMap<>();

    public void registerVehicle(String vehicleType, Vehicle<Vehicle> vehicle) {
        vehicleMap.put(vehicleType, vehicle);
    }

    public Vehicle getVehicle(String vehicleType) {
        return vehicleMap.get(vehicleType).copy();
    }

}
