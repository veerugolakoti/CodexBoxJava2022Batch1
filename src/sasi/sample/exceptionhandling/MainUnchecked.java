package sasi.sample.exceptionhandling;

import sasi.sample.exceptionhandling.ExceptionHandling;
import sasi.sample.exceptionhandling.Unchecked;
public class MainUnchecked {
    public static void main(String[] args) {
       try{
           int arr []= {1,2,3,4};
                   System.out.println(arr[3]);
       }catch (ArithmeticException a ){
           System.out.println("ArrayIndexOutOfBoundsException");
       }
    }
}
