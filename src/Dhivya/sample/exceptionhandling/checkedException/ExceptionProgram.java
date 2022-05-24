package Dhivya.sample.exceptionhandling.checkedException;

import rajat.sample.inheritance.SonyLaptop;

public class ExceptionProgram {
    public static void main(String[] args) {



    /* try {
         int a=30, b=0;
         int c=a/b;
         System.out.println("Adding number: " + c);
     }
     catch (ArithmeticException e){
         //int d=100,f=10;
         //int g=d/f;
         //System.out.println(g);
         System.out.println(e);
     }


 }*/
        IndexOutOfBound indexOutOfBound = new IndexOutOfBound();
        try {
            String str = null;
            System.out.println(str);
        } catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }

    }}