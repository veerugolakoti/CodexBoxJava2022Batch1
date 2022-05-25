package BhargavTej27.DailyTopicsProblems.MainPackage;

import BhargavTej27.DailyTopicsProblems.ExceptionExamples.ExceptionHandling2;
import smrutiranjan.practice.excedemo.exceptionhandling.ExceptionHandling;

import static BhargavTej27.DailyTopicsProblems.ExceptionExamples.ExceptionHandling2.facebook;
import static BhargavTej27.DailyTopicsProblems.ExceptionExamples.ExceptionHandling2.instagram;

public class Main {
    public static void main(String[] args) {
// ExceptionHandling2.instagram(10, 0);
        int a=10;
        int b=0;
        System.out.println();
        try{
            int i = facebook(a,b);
        }catch(ArithmeticException ar){
            System.out.println(ar.getMessage());
        }
//        System.out.println(exceptionHandling2);
        System.out.println("shiva");


    }
}
