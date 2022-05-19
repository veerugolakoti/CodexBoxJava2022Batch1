package rajat.sample.assessment.assessment1;

import java.util.Scanner;

public class CalculatorApp {
    public void claculate(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value1::");
        int num1=sc.nextInt();
        System.out.println("Enter a value2::");
        int num2=sc.nextInt();
        System.out.println("choose one of the operator= +,*,-::");
        System.out.println("Operator=");
       String str=sc.next();

        switch (str){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator...");


        }
    }
    public static void main(String[] args) {
        CalculatorApp calculatorApp=new CalculatorApp();
        calculatorApp.claculate();


    }
}
