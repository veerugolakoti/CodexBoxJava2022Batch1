package Swathi.ExceptionHandling;

public class MyClass1 { //unchecked
    public static void main(String[] args) throws ArithmeticException{ //without using try nd catch
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
}
