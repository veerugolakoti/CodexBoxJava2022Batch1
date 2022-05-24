package Shiva.ExceptionHandling.UserDefinedException;

public class ArthmeticEx {
    public void arthmeticExample(int a, int b) {
        try {
            int c = a/b;
            System.out.println(c);
        } catch (MyExceptionExample mx) {
            System.out.println("User defined exception");
            throw new MyExceptionExample("Trying to divide with zero");
        }
    }
}
