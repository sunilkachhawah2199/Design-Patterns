package machine_coding.parking_lot.service;

import machine_coding.parking_lot.models.*;
import machine_coding.parking_lot.repository.TicketRepo;
import machine_coding.parking_lot.strategy.AssignSpotStrategy;

import java.util.Date;

public class TicketServiceImpl implements TicketIService {

    private static int id=0;

    /* DI of other service repo is not a goof practise
    GateRepo gateRepo;
    public TicketServiceImpl(GateRepo gateRepo){
        this.gateRepo=gateRepo;
    }
     */

    GateService gateService;
    VehicleService vehicleService;
    AssignSpotStrategy assignSpotStrategy;
    ParkingLotService parkingLotService;
    TicketRepo ticketRepo;

    public TicketServiceImpl(GateService gateService,
                             VehicleService vehicleService,
                             AssignSpotStrategy assignSpotStrategy,
                             ParkingLotService parkingLotService,
                             TicketRepo ticketRepo){
        this.gateService=gateService;
        this.vehicleService=vehicleService;
        this.assignSpotStrategy=assignSpotStrategy;
        this.parkingLotService=parkingLotService;
        this.ticketRepo=ticketRepo;
    }
    /*
    goal: create ticket and store in db
    1. using the gate if=d we can fetch gate object
    2. vehicle object= number + type | both are present in input
    3. when vehicle come first time in parking lot: we have to save this vehicle in db
    4. if come 2 nd time: then just fetch from db | no sense of creating new vehicle in db, we will waste resources
    5. using strategy design pattern find empty spot for parking
    6. create the object of ticket and store it
     */
    @Override
    public Ticket generateTicket(int gateId, String vehicleNumber, String vehicleType) throws Exception{
        /*
        we used directly gate repo
        this is correct but service can use only their repo directly, if service access someone else's repo then that owner service should be used to communicate with other repo.
        we will do this work using Gate service
        Gate gate=gateRepo.getGateById(gateId);
         */

        Gate gate= gateService.getGateById(gateId);
        Vehicle vehicle=vehicleService.getOrAddVehicle(vehicleNumber, vehicleType);
        VehicleType vt= VehicleType.getTypefromString(vehicleType);
        ParkingLot parkingLot= parkingLotService.getParkingLotByGateId(gateId);

        // now for generating last part is assign spot for paring after that we can generate ticket
        Spot spot= assignSpotStrategy.assignSpot(vt,parkingLot);


        Ticket ticket=new Ticket();
        ticket.setId(id);
        ticket.setAssignedSpot(spot);
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        Ticket tt=ticketRepo.insertIcket(ticket);
        return tt;
    }
}
