package Nag.Interfaces;

import java.util.Scanner;

public class ShapeArea implements Area{
   public void square() {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter side value");
       int x= sc.nextInt();
       int AreaOfSquare=x*x;
       System.out.println("Area of circle "+AreaOfSquare);
   }

    @Override
    public void rectangle() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter length value");
        int l= sc.nextInt();
        System.out.println("Enter breadth value");
        int b= sc.nextInt();
        int AreaOfRectangle=l*b;
        System.out.println("Area of Rectangle "+AreaOfRectangle);
   }

    @Override
    public void circle() {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter radies value");
        double r=sc.nextDouble();
        double AreaOfCircle=3.14*r*r;
        System.out.println("Area of Circle "+AreaOfCircle);

    }
}
