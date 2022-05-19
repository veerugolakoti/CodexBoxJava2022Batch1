package BhargavTej27.Assignment1;

import java.util.Scanner;

public class Ques2Calculator {
    public static void main(String[] args) {
        System.out.println("Enter any two values");
        Scanner rr=new Scanner(System.in);
        int num1 = rr.nextInt();
        int num2 = rr.nextInt();
        System.out.println("Enter operation");
        char dbs=rr.next().charAt(0);
        int Add=num1+num2,Sub=num1-num2,Mult=num1*num2,Div=num1/num2;
        switch(dbs){
            case '+':
                System.out.println(Add);//Addition
                break;
            case '*':
                System.out.println(Mult);//multiplication
                break;
            case '-':
                System.out.println(Sub);//Subtraction
                break;
            case '/':
                System.out.println(Div);//Division
                break;
        }

    }
}