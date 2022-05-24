package mounika.sample;

import Dhivya.sample.exceptionhandling.IndexOutOfBound;

import java.lang.reflect.Array;

public class TrycatchFinally {
    public static void main(String[] args) {

        int a[]  = {2, 3, 4, 5, 6};
        try {
            System.out.println("The element of index ");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("this is the array ");
        }finally{
            a[0]=6;
            System.out.println("this is wrong");
        }
    }
}