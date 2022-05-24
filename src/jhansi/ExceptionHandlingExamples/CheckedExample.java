package jhansi.ExceptionHandlingExamples;

public class CheckedExample {
    private String name;
    int id;
    public void method(){
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("division with zero");
        }
        finally {
            System.out.println("final is found");
        }
            System.out.println("division of cheked example");
        }

    }


