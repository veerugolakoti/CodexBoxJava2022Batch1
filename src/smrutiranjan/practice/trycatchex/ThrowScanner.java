package smrutiranjan.practice.trycatchex;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ThrowScanner ts= new ThrowScanner();
        ts.checkAge(18);
        System.out.println(ts);
    }
}

