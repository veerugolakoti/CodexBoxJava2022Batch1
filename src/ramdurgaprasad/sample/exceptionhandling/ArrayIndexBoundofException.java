package ramdurgaprasad.sample.exceptionhandling;
import java.util.*;
public class ArrayIndexBoundofException {
    public void Array(){
    Scanner scanner =new Scanner(System.in);
    int []array = new int[13];
    try{
        System.out.println("enter the value to check the array index");
       int a= scanner.nextInt();
      int i= array[a];
      if(array[a]>=12)
          System.out.println("the array is with in the bouundry:");
    }catch(ArrayIndexOutOfBoundsException arr){
        System.out.println("the execution is ArrayIndexOutOfBoundsException  ");
    }
        }

}
