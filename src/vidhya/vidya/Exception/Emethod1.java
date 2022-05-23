package vidhya.vidya.Exception;

public class Emethod1 {
    public static void main(String[] args) {
        try {
            int divideByZero = 3/0;
            System.out.println("the value is");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is" + e.getMessage());
        }
        finally {
            System.out.println("this is the final statement");
        }
    }
}
