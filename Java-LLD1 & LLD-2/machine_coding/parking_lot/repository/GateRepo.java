package machine_coding.parking_lot.repository;

// during design interview we have to use in memory database

import machine_coding.parking_lot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepo {
    private Map<Integer, Gate> map;

    // if someone give us to existing gate db
    public GateRepo(Map<Integer, Gate> map){
        this.map=map;
    }



    // if someone need new db
    public GateRepo(){
        this.map=new HashMap<>();
    }

    // methods to get gate object by using id
    public Gate getGateById(int gateId) {
        return map.get(gateId);
    }
}
