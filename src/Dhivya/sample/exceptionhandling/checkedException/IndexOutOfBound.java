package Dhivya.sample.exceptionhandling.checkedException;

public class IndexOutOfBound extends ExceptionProgram{
    //public static void main(String[] args) {


    public ExceptionProgram get;

    {

        try {
            String str = "Hello Exception Handling";
            char c = str.charAt(28); //the vale is out of bound so it goes catch block
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bound Exception");

        }


    }

    public Object clone() throws CloneNotSupportedException {
        return null;
    }

}


