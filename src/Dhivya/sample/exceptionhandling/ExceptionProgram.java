package Dhivya.sample.exceptionhandling;

public class ExceptionProgram {
    public static void main(String[] args) {



    /* try {
         int a=30, b=0;
         int c=a/b;
         System.out.println("Adding number: " + c);
     }
     catch (ArithmeticException e){
         //int d=100,f=10;
         //int g=d/f;
         //System.out.println(g);
         System.out.println(e);
     }


 }*/
        IndexOutOfBound indexOutOfBound = new IndexOutOfBound();
        try {
            indexOutOfBound.clone();
            String str = null;
            System.out.println(str.length());
        } catch (java.lang.NullPointerException e) {
            System.out.println(e);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }}