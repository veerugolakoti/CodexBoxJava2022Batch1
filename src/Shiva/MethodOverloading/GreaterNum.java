package Shiva.MethodOverloading;

public class GreaterNum {
    static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    static double max(double a, double b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
