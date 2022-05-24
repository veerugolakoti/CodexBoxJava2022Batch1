package Abhilash.exceptionhandling;

public class CustomExceptionExample extends Exception {
    String message = "djbf";
    public CustomExceptionExample() {
    }
     public CustomExceptionExample(String message) {
        super(message);
    }

}
