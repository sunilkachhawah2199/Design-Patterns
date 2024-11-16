package machine_coding.parking_lot.models;

public class Spot extends  BaseModel{
    private String name;
    private SpotStatus spotStatus; // which vehicle can be parked here just find that.
    VehicleType vehicleType;


    // but we have no need to store vehicle here why?
    // because for assigning any spot to someone that spot should be unoccupied, we don;t care which vehicle is present.

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
