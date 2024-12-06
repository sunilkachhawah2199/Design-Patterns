package machine_coding.parking_lot.service;

import machine_coding.parking_lot.exceptions.InvalidRequestException;
import machine_coding.parking_lot.models.ParkingLot;

public interface ParkingLotService {
    public ParkingLot getParkingLotByGateId(int gateId) throws InvalidRequestException;
}
