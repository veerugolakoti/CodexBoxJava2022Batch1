package Sivannarayana.Assessment.Exception;

public class Exceptionexample {
    public static void main(String[] args) {
        try {
        int dividebyzero = 5/0;
        System.out.println("rest of the code in try block");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception  "+ e.getMessage());

        }
    }
}
