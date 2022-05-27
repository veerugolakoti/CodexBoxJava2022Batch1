package ramdurgaprasad.sample.exceptionhandling;
import com.sun.xml.internal.stream.Entity;

import java.util.*;
public class ArithmeticEception {
    public void Displaymethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any value in the varaible:a");
        int a = scanner.nextInt();
        System.out.println("enter the second value to the another varaible:b");
        int b = scanner.nextInt();
        int c = a / b;


        try {
            if (c >= 0)
                System.out.println("the output for division of values:" + c);

        } catch (ArithmeticException ae) {
            System.out.println("the execution went Arthimetic exception ");


        }
    }
}
