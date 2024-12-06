package machine_coding.parking_lot.dtos;

// DTO: data transfer object

import machine_coding.parking_lot.exceptions.InvalidRequestException;

public class GenerateTicketRequestDtos {
    private int gateId;
    private String vehicleNumber;
    private String vehicleType;


    //Getter and setter
    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId){
        this.gateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {

        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {

        this.vehicleType = vehicleType;
    }
}
