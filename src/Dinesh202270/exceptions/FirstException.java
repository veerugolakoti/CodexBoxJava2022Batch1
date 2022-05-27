package Dinesh202270.exceptions;

import java.util.Scanner;

public class FirstException {
    Scanner sc = new Scanner(System.in);


public int division()
{
    System.out.println("enter two numbers ");
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c = 0;


    try
    {
         c=a/b;
    } catch (Exception e) {
        System.out.print("you cant give b as zero "+ e.toString());
    }

   return c;

}


public String name()
{
        String s=null;

    return s;
}
}
