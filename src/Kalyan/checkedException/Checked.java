package Kalyan.checkedException;
public class Checked {
    public static void main(String[] args){
        try {
            int a=20,b=5,c=5,f;
            f=a/(b-c);
            System.out.println("divisible by" +f);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    }
