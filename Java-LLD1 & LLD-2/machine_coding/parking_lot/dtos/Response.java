package machine_coding.parking_lot.dtos;

import java.util.stream.Stream;

public class Response {
    private ResponseStatus responseStatus;
    private String message;


    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
