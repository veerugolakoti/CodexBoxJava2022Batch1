package Abhilash.exceptionhandling;

public class Number {
    public static void main(String[] args) {

        try{
            int div = 18/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception because of divide by zero.");
        }

    }


}
