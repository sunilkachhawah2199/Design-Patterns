package machine_coding.parking_lot.exceptions;

import com.sun.jdi.request.InvalidRequestStateException;

public class InvalidRequestException extends RuntimeException{
    public InvalidRequestException(String message){
        super(message);
    }
}
