package machine_coding.parking_lot.service;

import machine_coding.parking_lot.exceptions.InvalidGateException;
import machine_coding.parking_lot.exceptions.InvalidRequestException;
import machine_coding.parking_lot.models.Gate;
import machine_coding.parking_lot.repository.GateRepo;

public class GateServiceImpl implements GateService{

    GateRepo gateRepo;
    public GateServiceImpl(GateRepo gateRepo){
        this.gateRepo=gateRepo;
    }


    @Override
    public Gate getGateById(int gateId) {
        Gate gate= gateRepo.getGateById(gateId);
        System.out.println(gate.getName());
        return gate;
    }
}
