package machine_coding.parking_lot.dtos;

import java.util.stream.Stream;

public class Response {
    private ResponseStatus responseStatus;
    private String error;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
