package Vamshi.sample.exceptionalhandling;

public class CheckUserException extends Exception {
    public CheckUserException(String message){
        super(message);
        System.out.println("check the values assigned");

    }
}
