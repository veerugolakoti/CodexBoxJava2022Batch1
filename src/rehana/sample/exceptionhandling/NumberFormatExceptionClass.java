package rehana.sample.exceptionhandling;

public class NumberFormatExceptionClass {
    public void getNumberFormatException(){
        try{
            int num = Integer.parseInt("rehana");
            System.out.println(num);
        }
        catch (NumberFormatException n){
            System.out.println("Number format exception");

        }


    }
}
