package ramdurgaprasad.sample.javaassessment;
import java.util.*;
public class MainOperations{
    public static void main(String[] args) {
        Operation op=new Operation();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number:");
        long g=sc.nextLong();;
        System.out.println("enter second number:");
        long h=sc.nextLong();
        System.out.println("the sub:"+op.sub(g,h));
        System.out.println("enter the 1st number:");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number:");
        int b=sc.nextInt();
        System.out.println("the addition:"+op.Add(a,b));
        System.out.println("enter the 1st number:");
        double c=sc.nextDouble();
        System.out.println("enter the 2nd number:");
        double d=sc.nextDouble();
        System.out.println("the mul of no's:"+op.mul(c,d));
        System.out.println("enter the 1st number:");
        float e=sc.nextFloat();
        System.out.println("enter the 2nd number:");
        float f=sc.nextFloat();
        System.out.println("the division of no's:"+op.div(e,f));
    }
}