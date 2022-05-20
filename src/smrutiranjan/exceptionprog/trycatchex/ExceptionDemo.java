package smrutiranjan.exceptionprog.trycatchex;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int i = 50/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    System.out.println("The code");
    }

}
