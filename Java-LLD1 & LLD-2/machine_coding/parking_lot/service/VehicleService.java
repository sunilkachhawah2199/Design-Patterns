package machine_coding.parking_lot.service;

import machine_coding.parking_lot.models.Vehicle;
import machine_coding.parking_lot.models.VehicleType;

public interface VehicleService {

    public Vehicle getOrAddVehicle(String vehicleNumber, String vehicleType);
}
