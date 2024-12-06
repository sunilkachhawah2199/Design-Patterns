package machine_coding.parking_lot.repository;

import machine_coding.parking_lot.models.Gate;
import machine_coding.parking_lot.models.ParkingLot;


import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepo {
    Map<Integer, ParkingLot> map;

    // 2 constructor for this map
    public ParkingLotRepo(Map<Integer, ParkingLot> map){
        this.map=map;
    }

    public ParkingLotRepo(){
        map=new HashMap<>();
    }

    public ParkingLot getParkingLotByGateId(int gateId){
        for(Map.Entry<Integer, ParkingLot> entry: map.entrySet()){
            ParkingLot pk=entry.getValue();
            for(Gate gate:pk.getGates()){
                if(gate.getId()==gateId) return pk;
            }
        }
        return null;
    }
}
