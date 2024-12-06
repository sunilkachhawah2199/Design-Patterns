package machine_coding.parking_lot.service;

import machine_coding.parking_lot.models.Vehicle;
import machine_coding.parking_lot.models.VehicleType;
import machine_coding.parking_lot.repository.VehicleRepo;

public class VehicleServiceImpl implements VehicleService{

    VehicleRepo vehicleRepo;
    public VehicleServiceImpl(VehicleRepo vehicleRepo){
        this.vehicleRepo=vehicleRepo;
    }


    // add vehicle if not exist
    @Override
    public Vehicle getOrAddVehicle(String vehicleNumber, String vehicleType) {
        VehicleType vt= VehicleType.getTypefromString(vehicleType);
        return vehicleRepo.createIfNotExist(vehicleNumber, vt);
    }
}
