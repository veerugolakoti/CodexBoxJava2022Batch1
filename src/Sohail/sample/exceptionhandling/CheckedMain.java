package Sohail.sample.exceptionhandling;

public class CheckedMain {
    public static void main(String [] args )  {
        CheckedException checkedException= new CheckedException();
        checkedException.setName("Sohail");
        checkedException.setNumber(8867374717l);
        System.out.println(checkedException.getName());
        System.out.println(checkedException.getNumber());
        CheckedException checkedException1= checkedException.getCheckException();
        checkedException1.setName("Rajat");
        checkedException1.setNumber(123456898l);
        System.out.println(checkedException1.getName());
        System.out.println(checkedException1.getNumber());
    }
}
