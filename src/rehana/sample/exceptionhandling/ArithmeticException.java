package rehana.sample.exceptionhandling;

public class ArithmeticException {

        int a = 200;
        int b = 0;


 int caluclation(){
     int data = 0;
        try {
            data  = a / b;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("ArithmeticException");
        }


     return data;
 }
}