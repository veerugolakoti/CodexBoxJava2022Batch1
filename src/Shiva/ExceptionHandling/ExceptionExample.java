package Shiva.ExceptionHandling;

public class ExceptionExample  implements Cloneable{
    String name = "Lenovo";
    int id = 111;

    public Object  myExceptionMethod() throws CloneNotSupportedException {
        return clone();
    }
}
