package mounika.sample.exceptionhandling;

public class CheckedException {
    public void division() {
         int a=10;
         int b=0;
          try{
              int c=a/b;
              System.out.println(c);
          }catch(ArithmeticException e){
              System.out.println("Arithmetic exception");
          }


    }

    }

