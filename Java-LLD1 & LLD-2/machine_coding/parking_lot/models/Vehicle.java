package machine_coding.parking_lot.models;

public class Vehicle extends BaseModel{
    private String vehcileNumber;
    private VehicleType vehicleType;

    public String getVehcileNumber() {
        return vehcileNumber;
    }

    public void setVehcileNumber(String vehcileNumber) {
        this.vehcileNumber = vehcileNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
