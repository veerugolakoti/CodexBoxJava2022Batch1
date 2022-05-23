package Kalyan.checkedException;

public class Garage{
    public static void main(String[] args){
        try {
            int f = 3 / 0;
            System.out.println("divisible by" +f);
        } catch (ArithmeticException e) {
            System.out.println(""+e.getMessage());
        }
    }
    }
