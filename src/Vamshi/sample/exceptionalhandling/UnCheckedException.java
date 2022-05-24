package Vamshi.sample.exceptionalhandling;

public class UnCheckedException extends RuntimeException {
    UnCheckedException(String message){
        super(message);
        System.out.println("Runtime exception acquired");
    }

}
