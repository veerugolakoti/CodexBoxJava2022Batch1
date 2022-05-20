package Kalyan.firstweekassignment;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        double a=3.1428,b=5.046;
        System.out.println("Before \n"+a);
        System.out.println(""+b);

        double temp=a;
        a=b;
        b=temp;

        System.out.println("After \n"+a);
        System.out.println(""+b);
    }
}
