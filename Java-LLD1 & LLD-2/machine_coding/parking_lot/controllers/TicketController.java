package machine_coding.parking_lot.controllers;


// model name should be according to that model on which we will perform crud


import machine_coding.parking_lot.dtos.GenerateTicketRequestDtos;
import machine_coding.parking_lot.dtos.GenerateTicketResponseDto;
import machine_coding.parking_lot.dtos.Response;
import machine_coding.parking_lot.dtos.ResponseStatus;
import machine_coding.parking_lot.exceptions.InvalidRequestException;
import machine_coding.parking_lot.models.Ticket;
import machine_coding.parking_lot.service.TicketIServiceImpl;


public class TicketController {
    // object of ticket service
    TicketIServiceImpl ticketServiceimpl;

    // dependency injection
    public TicketController(TicketIServiceImpl ticketServiceImpl){
        this.ticketServiceimpl=ticketServiceImpl;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDtos requestDtos){

        int gateId=requestDtos.getGateId();
        String vehcleNumber=requestDtos.getVehicleNumber();
        String vehicleType=requestDtos.getVehicleType();

        GenerateTicketResponseDto output=new GenerateTicketResponseDto();
        Response response=new Response(); // response object

        // validation before passing to service
        try{
            if(gateId<=0)
                throw new InvalidRequestException("please enter gate number");

            if(vehcleNumber.equals(null))
                throw new InvalidRequestException("please enter vehicle number");

            if(vehicleType.equals(null))
                throw new InvalidRequestException("please enter vehicle type");

        }
        catch (InvalidRequestException e){
            response.setError(e.getMessage());
            response.setResponseStatus(ResponseStatus.FAILED);
            output.setresponse(response);
        }




        // we get Ticket object from service layer
        try{
            Ticket ticket=ticketServiceimpl.generateTicket(gateId, vehcleNumber,vehicleType);
            output.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }
        // if error was occurred due to ticket service
        catch (Exception e){
            // if error occur then ticket will be null and error message will be present and status will be failed
            response.setError(e.getMessage());
            response.setResponseStatus(ResponseStatus.FAILED);
        }

        output.setresponse(response);
        return output;

    }

    // ------------------ mapper classes ------------------


}
