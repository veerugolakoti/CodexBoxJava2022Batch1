package Shiva.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        ExceptionExample exceptionEx = new ExceptionExample();
        System.out.println(exceptionEx.id);
        System.out.println(exceptionEx.name);
        ExceptionExample exm =  exceptionEx.myExceptionMethod();
        exm.id = 12;
        exm.name = "Dell";
        System.out.println(exm.id);
        System.out.println(exm.name);
    }
}
