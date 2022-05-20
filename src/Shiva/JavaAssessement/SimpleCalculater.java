package Shiva.JavaAssessement;

import java.util.*;
import java.io.*;

public class SimpleCalculater {
    public static void main(String[] args) {
        String operator;
        double num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the operator: (+, -, *, /): ");
        operator = input.next();

        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("The addition of two numbers is :" + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("The substraction of two numbers is :" + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("The multiplication of two numbers is :" +result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("The division of two numbers is :" +result);
                break;
            default:
                System.out.println("You entered invalid operator");
                break;
         }
    }
}
