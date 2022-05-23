package chandan.checkedException;

public class TryCatchBlock {
    public static void main(String[] args) throws RuntimeException {
        try {
            int dividebyzero = 5 / 0;
            System.out.println("Undefined");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException ~ " + e.getMessage());
        }

    }
}
