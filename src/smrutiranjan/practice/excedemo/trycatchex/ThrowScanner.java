package smrutiranjan.practice.excedemo.trycatchex;

import java.util.Scanner;

public class ThrowScanner  {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }



    }


