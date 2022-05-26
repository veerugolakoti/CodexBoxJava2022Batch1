package sasi.sample.exceptionhandling;

public class UncheckedException {
    public static void main(String[] args) {
       try{
           int arr []= {1,2,3,4};
                   System.out.println(arr[3]);
       }catch (ArithmeticException a ){
           System.out.println("ArrayIndexOutOfBoundsException");
       }
    }
}
