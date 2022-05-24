package rajat.sample.exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionClass {
     public void getDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a::");
        int a = scanner.nextInt();
        try{
        System.out.println("Enter the value of b::");
        int b = scanner.nextInt();

            int c = a / b;
            System.out.println("The value of c::" + c);
        }catch (InputMismatchException ime){
            System.out.println("Only enter numeric value");
        }catch (ArithmeticException ae){
            System.out.println("Plz enter non Zero value in 'b'");
        }
    }

}
