package machine_coding.parking_lot.dtos;

import machine_coding.parking_lot.models.Ticket;

public class GenerateTicketResponseDto {
    private Ticket ticket;

    // if response is null it means ticket was not created and we can't return ticket
    private Response response;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Response getresponse() {
        return response;
    }

    public void setresponse(Response response) {
        this.response = response;
    }
}
