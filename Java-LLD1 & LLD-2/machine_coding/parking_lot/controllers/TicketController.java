package machine_coding.parking_lot.controllers;

import machine_coding.parking_lot.dtos.*;
import machine_coding.parking_lot.exceptions.InvalidGateException;
import machine_coding.parking_lot.exceptions.InvalidRequestException;
import machine_coding.parking_lot.models.Ticket;
import machine_coding.parking_lot.service.TicketIService;

public class TicketController {

    private TicketIService ticketService;

    // Dependency Injection
    public TicketController(TicketIService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDtos requestDtos) {
        GenerateTicketResponseDto output = new GenerateTicketResponseDto();
        Response response = new Response();

        try {
            // Validate input
            if (requestDtos == null) {
                throw new InvalidRequestException("Request object cannot be null");
            }

            int gateId = requestDtos.getGateId();
            String vehicleNumber = requestDtos.getVehicleNumber();
            String vehicleType = requestDtos.getVehicleType();

            if (gateId <= 0) {
                throw new InvalidGateException("Please enter a valid gate number");
            }

            if (vehicleNumber == null || vehicleNumber.isEmpty()) {
                throw new InvalidRequestException("Please enter a valid vehicle number");
            }

            if (vehicleType == null || vehicleType.isEmpty()) {
                throw new InvalidRequestException("Please enter a valid vehicle type");
            }

            // Call the service layer
            Ticket ticket = ticketService.generateTicket(gateId, vehicleNumber, vehicleType);

            // Populate response
            output.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (InvalidGateException | InvalidRequestException e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage("An unexpected error occurred: " + e.getMessage());
        }

        output.setresponse(response);
        return output;
    }
}
