package machine_coding.parking_lot.service;

import machine_coding.parking_lot.exceptions.InvalidGateException;
import machine_coding.parking_lot.models.Gate;

public interface GateService {

    public Gate getGateById(int gateId) throws InvalidGateException;

}
