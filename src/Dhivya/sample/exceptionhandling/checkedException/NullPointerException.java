package Dhivya.sample.exceptionhandling.checkedException;

public class NullPointerException {
    public static void main(String[] args) {
        //String str=null;
       //System.out.println(str.length());
        try {
            String str=null;
            System.out.println(str.length());
        }catch (java.lang.NullPointerException e){
            System.out.println("Null pointer Exception");


        }

    }
}
