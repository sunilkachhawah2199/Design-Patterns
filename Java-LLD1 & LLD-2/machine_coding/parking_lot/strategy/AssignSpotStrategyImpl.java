package machine_coding.parking_lot.strategy;

import machine_coding.parking_lot.exceptions.NoSpotAvailableException;
import machine_coding.parking_lot.models.*;

public class AssignSpotStrategyImpl implements AssignSpotStrategy{

    @Override
    public Spot assignSpot(VehicleType vehicleType, ParkingLot parkingLot) throws NoSpotAvailableException {
        // floors has section, section has spot
        for(Floor floor: parkingLot.getFloors()){
            // if floor is not operation then skip that floor
            if(!floor.getFloorStatus().equals(FloorStatus.OPERATIONAL)) continue;
            for(Section sec: floor.getSections()){
                for(Spot spot: sec.getSpots()){
                    SpotStatus spotStatus=spot.getSpotStatus();
                    // return spot if spot is unoccupied and same vehicle type
                    if(spotStatus.equals(SpotStatus.UNOCCUPIED) && spot.getVehicleType().equals(vehicleType))

                        return spot;
                }
            }
        }
        throw new NoSpotAvailableException("no free spot is present for parking");
    }
}
