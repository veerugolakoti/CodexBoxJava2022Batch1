package smrutiranjan.practice.excedemo.exceptionhandling;
    import java.lang.*;
public class ExceptionHandlingMain {
    public static void main(String[] args) { //throws CloneNotSupportedException {
        ExceptionHandling eh2 = new ExceptionHandling(2,"smr");

        eh2.getS();
        System.out.println( eh2.getI());
        System.out.println( eh2.getS());

        if (eh2 != null)
        {
            eh2.setI(4);
            eh2.setS("ran");
        }
    }
}

