package Kalyan.firstweekassignment;

public class CalculateUsingJavaSwitchStatement {
    public static void main(String[] args) {
        int Operator='*',a=20,b=30;
        switch (Operator) {
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
