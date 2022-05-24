package Dhivya.sample.exceptionhandling;

public class FinallyProgram {
    public static void main(String[] args) {
        try{
            int data=25/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println("Airthmetic Exception");
        }
        finally {
            System.out.println("finally ");
        }
        //System.out.println("hello");
    }
}
