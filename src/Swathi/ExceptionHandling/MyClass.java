package Swathi.ExceptionHandling;

import com.sun.corba.se.spi.extension.ZeroPortPolicy;

public class MyClass{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException h) {
            System.out.println("Division by zero is not possible");
        }
    }
}

