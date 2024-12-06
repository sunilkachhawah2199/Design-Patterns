package machine_coding.parking_lot;

import LLD_1_Part_2.atomic_data_structures.Array;
import machine_coding.parking_lot.controllers.TicketController;
import machine_coding.parking_lot.dtos.GenerateTicketRequestDtos;
import machine_coding.parking_lot.dtos.GenerateTicketResponseDto;
import machine_coding.parking_lot.dtos.ResponseStatus;
import machine_coding.parking_lot.exceptions.InvalidRequestException;
import machine_coding.parking_lot.models.*;
import machine_coding.parking_lot.repository.GateRepo;
import machine_coding.parking_lot.repository.ParkingLotRepo;
import machine_coding.parking_lot.repository.TicketRepo;
import machine_coding.parking_lot.repository.VehicleRepo;
import machine_coding.parking_lot.service.*;
import machine_coding.parking_lot.strategy.AssignSpotStrategy;
import machine_coding.parking_lot.strategy.AssignSpotStrategyImpl;

import java.util.*;

public class ParkingLotRunner {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);



        // data adding in parking lot
        // spot creation
        Spot s1=new Spot();
        s1.setId(1);
        s1.setName("corner1");
        s1.setSpotStatus(SpotStatus.UNOCCUPIED);

        Spot s2=new Spot();
        s2.setId(2);
        s2.setName("corner2");
        s2.setSpotStatus(SpotStatus.UNOCCUPIED);

        List<Spot> spots= Arrays.asList(s1, s2);


        Section sec1=new Section(1, "left corner", spots);
        List<Section> sections=Arrays.asList(sec1);

        Floor f1=new Floor(1, sections, FloorStatus.OPERATIONAL);
        List<Floor> floors=Arrays.asList(f1);


        Gate entry1=new Gate(1, "Entry1", GateType.ENTRY);
        Gate entry2=new Gate(2, "Exit", GateType.EXIT);
        List<Gate> gates=Arrays.asList(entry1, entry2);

        ParkingLot p1=new ParkingLot();
        p1.setFloors(floors);
        p1.setGates(gates);
        HashMap<Integer, ParkingLot> parkingLotHashMap=new HashMap<>();
        parkingLotHashMap.put(1, p1);

        HashMap<Integer, Gate> gateHashMap=new HashMap<>();
        gateHashMap.put(1, entry1);
        gateHashMap.put(2, entry2);





        HashMap<Integer, ParkingLot> parking=new HashMap<>();
        parking.put(1, p1);

        // object of repo
        GateRepo gateRepo=new GateRepo(gateHashMap);
        ParkingLotRepo parkingLotRepo=new ParkingLotRepo(parkingLotHashMap);
        TicketRepo ticketRepo=new TicketRepo();
        VehicleRepo vehicleRepo=new VehicleRepo();


        //strategy object
        AssignSpotStrategy assignSpotStrategy=new AssignSpotStrategyImpl();

        // object of service
        GateService gateService=new GateServiceImpl(gateRepo);
        VehicleService vehicleService=new VehicleServiceImpl(vehicleRepo);
        ParkingLotService parkingLotService=new ParkingLotServiceImpl(parkingLotRepo);


        TicketIService ticketIService=new TicketServiceImpl(gateService, vehicleService, assignSpotStrategy, parkingLotService, ticketRepo);

        TicketController ticketController=new TicketController(ticketIService);

        // generate ticket for vehicle
        GenerateTicketRequestDtos generateTicketRequestDtos=new GenerateTicketRequestDtos();
        System.out.println("Enter gate number");
        int gateId=sc.nextInt();


        generateTicketRequestDtos.setGateId(gateId);

        System.out.println("enter vehicle number");
        String vehicleNumber=sc.next();
        generateTicketRequestDtos.setVehicleNumber(vehicleNumber);

        System.out.println("Enter vehicle type");
        String vehicleType=sc.next();

        generateTicketRequestDtos.setVehicleType(vehicleType);

        GenerateTicketResponseDto res =  ticketController.generateTicket(generateTicketRequestDtos);
        System.out.println(res.getresponse().getMessage());
        if(res.getresponse().equals(ResponseStatus.FAILED)){
            throw new Exception("ticket can't be generated");
        }



    }
}
