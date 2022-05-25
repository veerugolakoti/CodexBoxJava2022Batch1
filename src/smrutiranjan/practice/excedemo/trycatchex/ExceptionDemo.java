package smrutiranjan.practice.excedemo.trycatchex;

public class ExceptionDemo {
    public void exceptionDemo() {
        try{
            int i = 50/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}
