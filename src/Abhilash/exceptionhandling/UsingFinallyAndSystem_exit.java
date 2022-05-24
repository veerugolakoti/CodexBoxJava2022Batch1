package Abhilash.exceptionhandling;

public class UsingFinallyAndSystem_exit {
   public int finallyUsage() {
       try {
           System.out.println("I am printing a value");
           Integer a = 100 / 0;
           System.out.println("out put is: " + a);
       } catch (ArithmeticException e) {
           System.out.println("division is not valid");
           // finally block will not print because of System.exit(0) command.
           System.exit(0);
       } finally {
           System.out.println("printing finally block");
       }
       return 0;
   }

}
