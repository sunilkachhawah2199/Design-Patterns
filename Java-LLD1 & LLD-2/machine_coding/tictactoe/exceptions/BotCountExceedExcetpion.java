package machine_coding.tictactoe.exceptions;


// if we extend RuntimeException then compiler will not force us to handle the exception
// if we extend Exception then compiler will force us to handle the exception
public class BotCountExceedExcetpion extends Exception {
    public BotCountExceedExcetpion(String message) {
        super(message);
    }
}


/*
------------------------- Runtime Exception -------------------------
1. Runtime exceptions represent problems that are the result of a programming problem, and as such, the API client code cannot reasonably be expected to handle them or to recover from them.
2. Runtime exceptions are not checked by the compiler, so it is not necessary to declare them in a method's throws clause. The compiler does, however, require that you either catch the runtime exceptions that a method can throw or declare that it can throw them.
3. Runtime exception are unchecked exception.


------------------------- Exception -------------------------
1. The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
2. Exception are checked by the compiler, so it is necessary to declare them in a method's throws clause. The compiler does, however, require that you either catch the runtime exceptions that a method can throw or declare that it can throw them.

 */