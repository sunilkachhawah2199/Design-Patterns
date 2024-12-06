package machine_coding.parking_lot.repository;

import machine_coding.parking_lot.models.Vehicle;
import machine_coding.parking_lot.models.VehicleType;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VehicleRepo {
    Map<Integer, Vehicle> map;

    // 2 constructor for this map
    public VehicleRepo(Map<Integer, Vehicle> map){
        this.map=map;
    }

    public VehicleRepo(){
        map=new HashMap<>();
    }

    // method to get vehicle from vehicle repo
    private static int id=0;

    public Vehicle createIfNotExist(String vehicleNumber, VehicleType vehicleType){

        // first trying to find vehicle in db if found then return same
        // entry set convert map into set
        for(Map.Entry<Integer, Vehicle> entry: map.entrySet()){
            Vehicle v= entry.getValue();
            if(v.getVehcileNumber().equals(vehicleNumber)){
                v.setUpdatedAt(new Date()); // only update updated part
                return v;
            }
        }

        // otherwise create new vehicle
        Vehicle v=new Vehicle();
        v.setId(id);
        v.setVehcileNumber(vehicleNumber);
        v.setVehicleType(vehicleType);
        v.setCreatedAt(new Date());
        v.setUpdatedAt(new Date());
        map.put(id,v);
        id++;
        return v;
    }
}
