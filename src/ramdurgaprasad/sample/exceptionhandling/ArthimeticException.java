package ramdurgaprasad.sample.exceptionhandling;
import java.util.*;
public class ArthimeticException {
    public void Display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value a:");
        int a=sc.nextInt();
        System.out.println("eneter the value of b:");
        int b=sc.nextInt();
     try{
         int c=a/b;
         System.out.println("the value of c:"+c);
     }catch(ArithmeticException ase){
         System.out.println("enter the valid value it cannot be zero'0'");
     }
    }


}
