package Shiva.MethodOverloading;

public class GreaterNum {
    public static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static double max(double a, double b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
