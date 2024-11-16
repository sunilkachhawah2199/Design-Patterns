package machine_coding.parking_lot.service;

import machine_coding.parking_lot.models.Ticket;

public interface TicketIServiceImpl {

    // this can throw also a error --> if parking lot is full
    public Ticket generateTicket(int gateId, String vehicleNumber, String vehicleType);

}
