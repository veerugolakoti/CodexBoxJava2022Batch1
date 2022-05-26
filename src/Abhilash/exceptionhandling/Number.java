package Abhilash.exceptionhandling;

public class Number {
    public void arithmeticExample() {
        int div = 1;
        try {
            div = 18 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception because of divide by zero.");
        }
    }
}
