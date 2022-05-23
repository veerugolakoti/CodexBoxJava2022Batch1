package Shiva.ExceptionHandling;

public class ExceptionExample  implements Cloneable{
    String name = "Lenovo";
    int id = 111;

    public ExceptionExample myExceptionMethod() {
        ExceptionExample exmp = null;
        try {
            Object ob = clone();
            exmp = (ExceptionExample) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The exception occurs when you does not apply Cloneable");
        }
        return exmp;
    }
}
