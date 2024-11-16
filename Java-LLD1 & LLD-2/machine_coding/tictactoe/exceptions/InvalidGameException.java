package machine_coding.tictactoe.exceptions;

// runtime exception means it is unchecked exception and compiler will not force us to handle
public class InvalidGameException extends RuntimeException {
    public InvalidGameException(String s) {
        super(s);
    }
}
