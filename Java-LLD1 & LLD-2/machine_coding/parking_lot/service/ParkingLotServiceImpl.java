package machine_coding.parking_lot.service;

import machine_coding.parking_lot.exceptions.InvalidRequestException;
import machine_coding.parking_lot.models.ParkingLot;
import machine_coding.parking_lot.repository.ParkingLotRepo;

public class ParkingLotServiceImpl implements ParkingLotService {
    ParkingLotRepo parkingLotRepo;

    public ParkingLotServiceImpl(ParkingLotRepo parkingLotRepo){
        this.parkingLotRepo=parkingLotRepo;
    }

    public ParkingLot getParkingLotByGateId(int gateId) throws InvalidRequestException{
        ParkingLot parkingLot=parkingLotRepo.getParkingLotByGateId(gateId);
        if(parkingLot==null) throw new InvalidRequestException("parking lot not exist");
        return parkingLotRepo.getParkingLotByGateId(gateId);
    }
}
