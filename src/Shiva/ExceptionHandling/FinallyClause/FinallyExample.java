package Shiva.ExceptionHandling.FinallyClause;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException a) {
            System.out.println("Division with zero is not possible");
        } finally {
            System.out.println("This is finally block");
        }
    }
}
