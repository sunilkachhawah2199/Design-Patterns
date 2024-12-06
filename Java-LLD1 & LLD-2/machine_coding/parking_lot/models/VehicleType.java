package machine_coding.parking_lot.models;

public enum VehicleType {
    CAR, BIKE, TRUCK, EV_CAR;

    public static VehicleType getTypefromString(String vehicleType){


        // chnage string into vehicle type
        vehicleType = vehicleType.toLowerCase();
        switch (vehicleType){
            case "bike":
                return VehicleType.BIKE;
            case "car":
                return VehicleType.CAR;
            case "truck":
                return VehicleType.TRUCK;
            case "ev-car":
                return VehicleType.EV_CAR;
            default:
                // this case will never happen
                throw new IllegalArgumentException("vehicle type is not allowed");
        }
    }
}
